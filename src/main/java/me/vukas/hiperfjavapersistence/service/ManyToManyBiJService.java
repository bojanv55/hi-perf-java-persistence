package me.vukas.hiperfjavapersistence.service;

import javax.transaction.Transactional;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookAuthorId;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookManyJ;
import me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.manytomanyjunction.BookAuthorRepository;
import me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.manytomanyjunction.BookManyJRepository;
import org.springframework.stereotype.Service;

@Service
public class ManyToManyBiJService {

  private BookManyJRepository repository;
  private BookAuthorRepository baRepository;

  public ManyToManyBiJService(
      BookManyJRepository repository,
      BookAuthorRepository baRepository) {
    this.repository = repository;
    this.baRepository = baRepository;
  }

  @Transactional
  public void saveBook(BookManyJ book){
    repository.save(book);
  }

  @Transactional
  public void removeAuthorFromBook(Long bookId, Long authorId){
    baRepository.deleteById(new BookAuthorId(bookId, authorId));
  }
}
