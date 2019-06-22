package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostCommentManyBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.SomeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyBiIT {

    @Autowired
    private OneToManyBiService oneToManyBiService;

    @Test
    public void commentShouldBeAssignedToPost(){
        PostOneBi post = new PostOneBi();
        post.setEnumeration(SomeEnum.ONE);
        PostCommentManyBi comment1 = new PostCommentManyBi();
        PostCommentManyBi comment2 = new PostCommentManyBi();

        post.addComment(comment1);
        post.addComment(comment2);

        assertThat(comment1).isNotEqualTo(comment2);    //not equal even if ids are both null

        oneToManyBiService.addNewPost(post);

        oneToManyBiService.getPostById(post.getId()).ifPresent(p -> assertThat(p.getComments()).contains(comment1, comment2));

        post.removeComment(comment2);
        oneToManyBiService.changePost(post);

        oneToManyBiService.getPostById(post.getId()).ifPresent(p -> {
            assertThat(p.getComments()).contains(comment1);
            assertThat(p.getComments()).doesNotContain(comment2);
        });

        PostOneBi post2 = new PostOneBi();
        post2.setEnumeration(SomeEnum.TWO);
        PostCommentManyBi comment21 = new PostCommentManyBi();
        PostCommentManyBi comment22 = new PostCommentManyBi();

        post2.addComment(comment21);
        post2.addComment(comment22);

        oneToManyBiService.addNewPost(post2);

        List<PostOneBi> results = oneToManyBiService.findByEnum(SomeEnum.TWO);

        //not duplicated using de-duplication
        assertThat(results).hasSize(1);
    }

}
