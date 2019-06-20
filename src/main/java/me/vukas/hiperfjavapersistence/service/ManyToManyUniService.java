package me.vukas.hiperfjavapersistence.service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.transaction.annotation.Transactional;
import me.vukas.hiperfjavapersistence.entity.relationship.manytomany.PostManyUni;
import me.vukas.hiperfjavapersistence.entity.relationship.manytomany.TagManyUni;
import me.vukas.hiperfjavapersistence.repository.relationship.manytomany.PostManyUniRepository;
import me.vukas.hiperfjavapersistence.repository.relationship.manytomany.TagManyUniRepository;
import org.springframework.stereotype.Service;

@Service
public class ManyToManyUniService {

  private PostManyUniRepository postRepo;
  private TagManyUniRepository tagRepo;

  public ManyToManyUniService(
      PostManyUniRepository postRepo,
      TagManyUniRepository tagRepo) {
    this.postRepo = postRepo;
    this.tagRepo = tagRepo;
  }

  @Transactional
  public void savePost(PostManyUni post){
    Set<TagManyUni> tags = post.getTags();
    Set<TagManyUni> persistedTags = tagRepo.findAllByNameIn(tags.stream().map(TagManyUni::getName).collect(
        Collectors.toSet()));

    persistedTags.forEach(post::removeTag);
    persistedTags.forEach(post::addTag);

    postRepo.save(post);
  }

  @Transactional(readOnly = true)
  public Optional<PostManyUni> getPost(Long id) {
    return postRepo.findById(id);
  }
}
