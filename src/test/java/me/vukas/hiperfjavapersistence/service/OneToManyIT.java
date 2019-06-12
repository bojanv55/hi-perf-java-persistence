package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.CompositeId;
import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.PostCommentUniMany;
import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.PostOneUni;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyIT {

    @Autowired
    private OneToManyService oneToManyService;

    @Test
    public void commentShouldBeAssignedToPost(){
        PostOneUni post = new PostOneUni();
        post.setId(new CompositeId(100L,200L));
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

        oneToManyService.getPostById(post.getId()).ifPresent(p -> assertThat(p.getComments()).contains(comment1, comment2));

        post.removeComment(comment2);
        oneToManyService.changePost(post);

        oneToManyService.getPostById(post.getId()).ifPresent(p -> {
            assertThat(p.getComments()).contains(comment1);
            assertThat(p.getComments()).doesNotContain(comment2);
        });
    }
}
