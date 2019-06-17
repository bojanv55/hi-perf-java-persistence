package me.vukas.hiperfjavapersistence.service;

import javax.transaction.Transactional;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany.PostManyBi;
import me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.manytomany.PostManyBiRepository;
import org.springframework.stereotype.Service;

@Service
public class ManyToManyBiService {

  private PostManyBiRepository repository;

  public ManyToManyBiService(
      PostManyBiRepository repository) {
    this.repository = repository;
  }

  @Transactional
  public void savePost(PostManyBi post){
    repository.save(post);
  }
}
