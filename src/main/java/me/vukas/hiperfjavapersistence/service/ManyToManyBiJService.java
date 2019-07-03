package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.AuthorManyJ;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookAuthorId;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookManyJ;
import me.vukas.hiperfjavapersistence.repository.jpa.relationship.bidirectional.manytomanyjunction.AuthorManyJRepository;
import me.vukas.hiperfjavapersistence.repository.jpa.relationship.bidirectional.manytomanyjunction.BookAuthorRepository;
import me.vukas.hiperfjavapersistence.repository.jpa.relationship.bidirectional.manytomanyjunction.BookManyJRepository;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class ManyToManyBiJService {

  private BookManyJRepository repository;
  private BookAuthorRepository baRepository;
  private AuthorManyJRepository authorManyJRepository;

  public ManyToManyBiJService(BookManyJRepository repository,
                              BookAuthorRepository baRepository,
                              AuthorManyJRepository authorManyJRepository) {
    this.repository = repository;
    this.baRepository = baRepository;
    this.authorManyJRepository = authorManyJRepository;
  }

  @Transactional
  public AuthorManyJ saveAuthor(AuthorManyJ author){
    return authorManyJRepository.save(author);
  }

  @Transactional(readOnly = true)
  public Optional<BookManyJ> getBook(Long bookId){
    return repository.findById(bookId);
  }

  @Transactional
  public void saveBook(BookManyJ book){
    repository.save(book);
  }

  @Transactional
  public void addAuthorsToBook(BookManyJ bookManyJ, AuthorManyJ... authors){
    //we passed in saved but deatached authors (no active Session) and not-saved book
    //since book has relation to authors as cascade all, and we save book with PERSIST
    //it will try to PERSIST authors, but it cannot since it is already in DB, and fails
    //so we need to PERSIST book, and then next time it will cascade MERGE
    BookManyJ loadedOrNew = repository.save(bookManyJ);
    Stream.of(authors).forEach(bookManyJ::addAuthor);
    repository.save(loadedOrNew);
  }

  @Transactional
  public void removeAuthorInTrans(BookManyJ book, AuthorManyJ author){
    repository.findById(book.getId()).ifPresent(b -> {
      b.removeAuthor(author);
      repository.save(b);
    });
  }

  @Transactional
  public void removeAuthorFromBook(Long bookId, Long authorId){
    baRepository.deleteById(new BookAuthorId(bookId, authorId));
  }
}
