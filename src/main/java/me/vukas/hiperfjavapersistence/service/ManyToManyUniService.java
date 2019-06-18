package me.vukas.hiperfjavapersistence.service;

import javax.transaction.Transactional;
import me.vukas.hiperfjavapersistence.entity.relationship.manytomany.PostManyUni;
import me.vukas.hiperfjavapersistence.repository.relationship.manytomany.PostManyUniRepository;
import org.springframework.stereotype.Service;

@Service
public class ManyToManyUniService {

  private PostManyUniRepository repository;

  public ManyToManyUniService(
      PostManyUniRepository repository) {
    this.repository = repository;
  }

  @Transactional
  public void savePost(PostManyUni post){
    repository.save(post);
  }
}
