package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.elementcollection.ComplexElement;
import me.vukas.hiperfjavapersistence.entity.relationship.elementcollection.PostWithCollection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostWithCollectionIT {

    @Autowired
    private PostWithCollectionService service;

    @Test
    public void postWithCollectionIsPreservingAllCollectionsInside(){
        PostWithCollection post = new PostWithCollection();
        post.addString("s1");
        post.addString("s2");
        post.addComplex(new ComplexElement("c1", 1, 1.0f));
        service.save(post);

        service.getById(post.getId()).ifPresent(p -> {
            assertThat(p.getListOfStrings()).hasSize(2);
            assertThat(p.getListOfComplex()).hasSize(1);
        });
    }

}
