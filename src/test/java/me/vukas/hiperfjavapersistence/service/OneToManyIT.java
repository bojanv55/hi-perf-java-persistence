package me.vukas.hiperfjavapersistence.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.CombinationOfAttribs;
import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.CompositeId;
import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.PostCommentUniMany;
import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.PostOneUni;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyIT {

    @Autowired
    private OneToManyService oneToManyService;

    @Test
    public void commentShouldBeAssignedToPost(){
        PostOneUni post = new PostOneUni();
        post.setId(new CompositeId(8L,9L));
        post.setCombination(new CombinationOfAttribs("a1", 1, 1.0F));
        PostCommentUniMany comment1 = new PostCommentUniMany();
        PostCommentUniMany comment2 = new PostCommentUniMany();
        PostCommentUniMany comment3 = new PostCommentUniMany();
        PostCommentUniMany comment4 = new PostCommentUniMany();

        post.addComment(comment1);
        post.addComment(comment2);
        post.addComment(comment3);
        post.addComment(comment4);

        assertThat(comment1).isNotEqualTo(comment2);    //not equal even if ids are both null

        oneToManyService.addNewPost(post);

        oneToManyService.getPostById(post.getId()).ifPresent(p -> {
            assertThat(p.getComments()).contains(comment1, comment2);
        });

        post.removeComment(comment2);
        oneToManyService.changePost(post);

        oneToManyService.getPostById(post.getId()).ifPresent(p -> {
            assertThat(p.getComments()).contains(comment1);
            assertThat(p.getComments()).doesNotContain(comment2);
        });
    }

    @Test
    public void concurrentInsertOfSameVersionShouldFail(){
        PostOneUni post1 = new PostOneUni();
        post1.setId(new CompositeId(100L,200L));

        oneToManyService.addNewPost(post1);

        PostOneUni post2 = new PostOneUni();
        post2.setId(new CompositeId(100L,200L));

        //cannot insert - same primary key and version is same (0 == 0)
        assertThatThrownBy(() -> oneToManyService.addNewPost(post2))
            .isInstanceOf(DataIntegrityViolationException.class);
    }

    @Test
    public void nextVersionOfPostShouldBeMergedAndSaved(){
        PostOneUni post1 = new PostOneUni();
        post1.setId(new CompositeId(1L,2L));
        post1.setCombination(new CombinationOfAttribs("a1", 1, 1.0F));
        PostCommentUniMany comment1 = new PostCommentUniMany();
        post1.addComment(comment1);

        oneToManyService.addNewPost(post1);

        PostOneUni post2 = new PostOneUni();
        post2.setId(new CompositeId(1L,2L));
        //combination will be updated
        post2.setCombination(new CombinationOfAttribs("a2", 2, 2.0F));
        //comment1 will be removed from collection and orphan-removed
        PostCommentUniMany comment2 = new PostCommentUniMany();
        PostCommentUniMany comment3 = new PostCommentUniMany();
        post2.addComment(comment2);
        post2.addComment(comment3);
        //if this is not set (and since entity is not attached) it would think it is new and fail
        //inserting (since same PK already exists)
        post2.setVersion(0);    //first insert will set v=0. this insert will set it to v=1

        oneToManyService.addNewPost(post2);

        oneToManyService.getPostById(new CompositeId(1L,2L)).ifPresent(p -> {
            //transaction is closed when enter this lambda; next transaction is used to update below;
            p.addComment(new PostCommentUniMany());
            oneToManyService.addNewPost(p); //no need to set version, since it is loaded from db
        });
    }

}
