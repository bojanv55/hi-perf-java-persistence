package me.vukas.hiperfjavapersistence.service;

import static org.assertj.core.api.Assertions.assertThat;

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
public class JooqIT {

  @Autowired
  private JooqService service;
  @Autowired
  private OneToManyBiService oneToManyBiService;

  @Test
  public void oneToManyWithJooq(){

    PostOneBi pob = new PostOneBi();
    pob.setEnumeration(SomeEnum.ONE);
    PostCommentManyBi pCmB1 = new PostCommentManyBi();
    PostCommentManyBi pCmB2 = new PostCommentManyBi();
    PostCommentManyBi pCmB3 = new PostCommentManyBi();
    pob.addComment(pCmB1);
    pob.addComment(pCmB2);
    pob.addComment(pCmB3);

    oneToManyBiService.addNewPost(pob);

    PostOneBiDto dto = service.getPostOneBi(pob.getId());

    assertThat(dto.getId()).isEqualTo(pob.getId());
  }

}
