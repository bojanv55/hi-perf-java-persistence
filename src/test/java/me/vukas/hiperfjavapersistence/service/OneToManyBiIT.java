package me.vukas.hiperfjavapersistence.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiDto;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostCommentManyBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.SomeEnum;
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
        comment21.setContent("one");
        PostCommentManyBi comment22 = new PostCommentManyBi();
        comment22.setContent("one");
        PostCommentManyBi comment23 = new PostCommentManyBi();
        comment23.setContent("two");
        PostCommentManyBi comment24 = new PostCommentManyBi();
        comment24.setContent("two");
        PostCommentManyBi comment25 = new PostCommentManyBi();
        comment25.setContent("two");
        PostCommentManyBi comment26 = new PostCommentManyBi();
        comment26.setContent("three");

        post2.addComment(comment21);
        post2.addComment(comment22);
        post2.addComment(comment23);
        post2.addComment(comment24);
        post2.addComment(comment25);
        post2.addComment(comment26);

        oneToManyBiService.addNewPost(post2);

        List<PostOneBiDto> results = oneToManyBiService.findByEnum(SomeEnum.TWO);

        //not duplicated using de-duplication
        assertThat(results).hasSize(1);
    }

}
