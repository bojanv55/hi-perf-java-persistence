package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany.PostManyBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany.TagManyBi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyBiIT {

  @Autowired
  private ManyToManyBiService service;

  @Test
  public void savingPostSavesTags(){
    PostManyBi post = new PostManyBi();
    post.addTag(new TagManyBi("one"));
    post.addTag(new TagManyBi("two"));
    post.addTag(new TagManyBi("three"));

    service.savePost(post);

    post.removeTag(new TagManyBi("two"));

    service.savePost(post);
  }
}
