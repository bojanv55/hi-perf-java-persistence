package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetoone.PostDetailsOneBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetoone.PostOneToOneBi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToOneBiIT {

    @Autowired
    private OneToOneBiService service;

    @Test
    public void savingOneToOneBiSide(){
        PostOneToOneBi post = new PostOneToOneBi();
        post.setContent("content");

        PostDetailsOneBi details = new PostDetailsOneBi();
        details.setDetails("details");

        post.setDetails(details);

        service.savePost(post);

        PostOneToOneBi post2 = new PostOneToOneBi();
        post2.setContent("content2");

        service.savePost(post2);

        int x = 22;

        service.loadPost(post.getId()).ifPresent(p -> {
            assertThat(p.getDetails()).isNotNull();
        });
    }
}
