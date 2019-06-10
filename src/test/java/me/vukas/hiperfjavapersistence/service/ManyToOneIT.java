package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostCommentMany;
import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostOne;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToOneIT {

    @Autowired
    private ManyToOneService manyToOneService;

    @Test
    public void commentShouldBeAssignedToPost(){
        PostOne post = new PostOne();
        PostCommentMany comment = new PostCommentMany();

        post = manyToOneService.newPost(post);
        comment = manyToOneService.addNewCommentForPost(comment, post.getId());
    }

}
