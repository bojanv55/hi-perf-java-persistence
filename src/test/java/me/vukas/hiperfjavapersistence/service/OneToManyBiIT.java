package me.vukas.hiperfjavapersistence.service;

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

        oneToManyBiService.addNewPost(post);

        oneToManyBiService.getPostById(post.getId()).ifPresent(p -> {
            PostOneBi p2 = p;
            int x = 22;
        });

        post.removeComment(comment2);
        oneToManyBiService.changePost(post);

        oneToManyBiService.getPostById(post.getId()).ifPresent(p -> {
            PostOneBi p2 = p;
            int x = 22;
        });
    }

}
