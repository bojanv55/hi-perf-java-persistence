package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.manytomany.PostManyUni;
import me.vukas.hiperfjavapersistence.entity.relationship.manytomany.TagManyUni;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyUniIT {

  @Autowired
  private ManyToManyUniService service;

  @Test
  public void savingPostSavesTags(){
    PostManyUni post = new PostManyUni();
    post.addTag(new TagManyUni("tag1"));
    post.addTag(new TagManyUni("tag2"));
    post.addTag(new TagManyUni("tag3"));

    service.savePost(post);

    PostManyUni post2 = new PostManyUni();
    post2.addTag(new TagManyUni("tag2"));

    service.savePost(post2);

    post.removeTag(new TagManyUni("tag2"));

    service.savePost(post);
  }
}
