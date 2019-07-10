package me.vukas.hiperfjavapersistence.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Optional;
import me.vukas.hiperfjavapersistence.dto.PageDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostCommentManyBiReadDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostCommentManyBiUpdateDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostCommentManyBiWriteDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiReadDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiWriteDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.SomeEnumDto;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostCommentManyBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.SomeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyBiIT {

  @TestConfiguration
  static class OneToManyBiConfig {

    @Bean
    public Jackson2RepositoryPopulatorFactoryBean populator(ObjectMapper mapper) {
      Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
      factory.setMapper(addMixins(mapper)); //needed for hierarchical structure and foreign keys
      factory.setResources(
          new Resource[]{new ClassPathResource("/populators/one_to_many_bi.json")});
      return factory;
    }

    private ObjectMapper addMixins(ObjectMapper mapper) {
      mapper.addMixIn(PostOneBi.class, PostOneBiMixIn.class);
      return mapper;
    }

    /**
     * Since we need to save PostOneBi with all child comments, we will use @id property inside json
     * so we know which child comment belongs to which parent post. This way, JPA can update foreign
     * keys in DB to reflect json structure
     */
    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, scope = PostOneBi.class)
    interface PostOneBiMixIn {}
  }

  @Autowired
  private OneToManyBiService oneToManyBiService;

  @Test
  public void commentShouldBeAssignedToPost() {
    PostOneBi post = new PostOneBi();
    post.setEnumeration(SomeEnum.ONE);
    PostCommentManyBi comment1 = new PostCommentManyBi();
    PostCommentManyBi comment2 = new PostCommentManyBi();

    post.addComment(comment1);
    post.addComment(comment2);

    assertThat(comment1).isNotEqualTo(comment2);    //not equal even if ids are both null

    oneToManyBiService.addNewPost(post);

    oneToManyBiService.getPostById(post.getId())
        .ifPresent(p -> assertThat(p.getComments()).contains(comment1, comment2));

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

    List<PostOneBiReadDto> results = oneToManyBiService.findByEnum(SomeEnum.TWO);

    //not duplicated using de-duplication
    assertThat(results).hasSize(1);
  }

  @Test
  public void creationAndUpdate() {
    List<PostOneBiReadDto> exists = oneToManyBiService.findByEnum(SomeEnum.THREE);
    assertThat(exists).isEmpty();

    PostOneBiWriteDto writeDto = new PostOneBiWriteDto();
    writeDto.setEnumeration(SomeEnumDto.THREE);
    writeDto.setUpdateThis("writeUpdateThis");
    writeDto.setDontUpdateThis("writeDontUpdateThis");

    PostOneBiReadDto readDto = oneToManyBiService.writePost(writeDto);

    PostCommentManyBiWriteDto writeComment1 = new PostCommentManyBiWriteDto();
    writeComment1.setContent("writeCom1");
    writeComment1.setUpdateThis("writeCom1Update");
    writeComment1.setDontUpdateThis("writeCom1DontUpdate");
    writeComment1.setPostId(readDto.getId());   //would be sent directly from front-end

    oneToManyBiService.writeCommentToPost(writeComment1);

    PostCommentManyBiWriteDto writeComment2 = new PostCommentManyBiWriteDto();
    writeComment2.setContent("writeCom2");
    writeComment2.setUpdateThis("writeCom2Update");
    writeComment2.setDontUpdateThis("writeCom2DontUpdate");
    writeComment2.setPostId(readDto.getId());

    PostCommentManyBiReadDto readCommentDto2 = oneToManyBiService.writeCommentToPost(writeComment2);

    Optional<PostOneBi> postWithAll = oneToManyBiService.getPostById(readDto.getId());

    postWithAll.ifPresent(p -> {
      assertThat(p.getId()).isEqualTo(readDto.getId());
    });

    PostCommentManyBiUpdateDto updateCommentDto2 = new PostCommentManyBiUpdateDto();
    updateCommentDto2.setId(readCommentDto2.getId());
    updateCommentDto2.setContent("newWriteCom2");
    updateCommentDto2.setUpdateThis("newWriteCom2Update");

    PostCommentManyBiReadDto updatedCommentDto2 = oneToManyBiService.updateComment(
        updateCommentDto2);

    postWithAll = oneToManyBiService.getPostById(readDto.getId());

    postWithAll.ifPresent(p -> {
      assertThat(p.getId()).isEqualTo(readDto.getId());
      assertThat(p.getComments()).hasSize(2);
    });

    oneToManyBiService.removeComment(readDto.getId(), updatedCommentDto2.getId());

    postWithAll = oneToManyBiService.getPostById(readDto.getId());

    postWithAll.ifPresent(p -> {
      assertThat(p.getId()).isEqualTo(readDto.getId());
      assertThat(p.getComments()).hasSize(1);
    });

    PageDto<PostOneBiReadDto> paginated = oneToManyBiService.getPage(SomeEnum.THREE, 0, 20);

    assertThat(paginated.getContent()).hasSize(20);

  }

  @Test
  public void deletingAllShouldWork(){
    oneToManyBiService.deleteAll(SomeEnum.ONE);
    oneToManyBiService.deleteAll(SomeEnum.TWO);
    oneToManyBiService.deleteAll(SomeEnum.THREE);

    fillData();

    //loops delete from post_one_bi where id=?
    oneToManyBiService.deleteAll(SomeEnum.ONE);
    oneToManyBiService.deleteAll(SomeEnum.TWO);
    oneToManyBiService.deleteAll(SomeEnum.THREE);

    fillData();

    //delete from post_one_bi where enumeration='ONE'
    oneToManyBiService.deleteAllInBulk(SomeEnum.ONE);
    oneToManyBiService.deleteAllInBulk(SomeEnum.TWO);
    oneToManyBiService.deleteAllInBulk(SomeEnum.THREE);
  }

  @Test
  public void paginationShouldWorkProperly() {
    //write comments
    fillData();

    PageDto<PostOneBiReadDto> paginated = oneToManyBiService.getPage(SomeEnum.THREE, 0, 20);

    assertThat(paginated.getContent()).hasSize(20);
    assertThat(paginated.getTotal()).isEqualTo(50);
    assertThat(paginated.getPageable().getPageNumber()).isEqualTo(0);
    assertThat(paginated.getPageable().getPageSize()).isEqualTo(20);

    paginated = oneToManyBiService.getPage(SomeEnum.THREE, 1, 20);

    assertThat(paginated.getContent()).hasSize(20);
    assertThat(paginated.getTotal()).isEqualTo(50);
    assertThat(paginated.getPageable().getPageNumber()).isEqualTo(1);
    assertThat(paginated.getPageable().getPageSize()).isEqualTo(20);

    paginated = oneToManyBiService.getPage(SomeEnum.THREE, 2, 20);

    assertThat(paginated.getContent()).hasSize(10);
    assertThat(paginated.getTotal()).isEqualTo(50);
    assertThat(paginated.getPageable().getPageNumber()).isEqualTo(2);
    assertThat(paginated.getPageable().getPageSize()).isEqualTo(20);
  }

  private void fillData(){
    for (int i = 1; i <= 50; i++) {
      PostOneBiWriteDto writeDto = new PostOneBiWriteDto();
      writeDto.setEnumeration(SomeEnumDto.THREE);
      writeDto.setUpdateThis("writeUpdateThis" + i);
      writeDto.setDontUpdateThis("writeDontUpdateThis" + i);
      PostOneBiReadDto readDto = oneToManyBiService.writePost(writeDto);
      for (int j = 1; j <= 2; j++) {
        PostCommentManyBiWriteDto writeComment = new PostCommentManyBiWriteDto();
        writeComment.setContent("writeCom" + i + ":" + j);
        writeComment.setUpdateThis("writeComUpdate" + i + ":" + j);
        writeComment.setDontUpdateThis("writeComDontUpdate" + i + ":" + j);
        writeComment.setPostId(readDto.getId());
        oneToManyBiService.writeCommentToPost(writeComment);
      }
    }
  }

}
