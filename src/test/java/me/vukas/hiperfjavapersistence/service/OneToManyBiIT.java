package me.vukas.hiperfjavapersistence.service;

import static org.assertj.core.api.Assertions.assertThat;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostCommentManyBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyBiIT {

    @Autowired
    private OneToManyBiService oneToManyBiService;

    @Test
    public void commentShouldBeAssignedToPost(){
        PostOneBi post = new PostOneBi();
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
    }

}
