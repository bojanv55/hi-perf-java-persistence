package me.vukas.hiperfjavapersistence.service;

import javax.transaction.Transactional;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany.BookManyBi;
import me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.manytomany.BookManyBiRepository;
import org.springframework.stereotype.Service;

@Service
public class ManyToManyBiService {

  private BookManyBiRepository repository;

  public ManyToManyBiService(
      BookManyBiRepository repository) {
    this.repository = repository;
  }

  @Transactional
  public void saveBook(BookManyBi book){
    repository.save(book);
  }
}
