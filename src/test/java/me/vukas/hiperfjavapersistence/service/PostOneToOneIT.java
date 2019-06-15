package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.onetoone.PostDetailsOne;
import me.vukas.hiperfjavapersistence.entity.relationship.onetoone.PostOneToOne;
import org.hibernate.Hibernate;
import org.hibernate.LazyInitializationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostOneToOneIT {

    @Autowired
    private PostOneToOneService service;

    @Test
    public void savingOneToOneUniSide(){
        PostDetailsOne detailsOne = new PostDetailsOne();
        detailsOne.setDetails("details");
        PostOneToOne postOneToOne = new PostOneToOne();
        postOneToOne.setContent("content");
        detailsOne.setPost(postOneToOne);

        service.savePostDetails(detailsOne);

        service.loadPostDetails(postOneToOne.getId()).ifPresent(d -> {
            assertThatThrownBy(() -> Hibernate.initialize(d.getPost()))
                    .isInstanceOf(LazyInitializationException.class);
        });
    }
}
