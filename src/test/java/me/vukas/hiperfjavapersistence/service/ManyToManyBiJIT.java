package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.AuthorManyJ;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookManyJ;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyBiJIT {

  @Autowired
  private ManyToManyBiJService service;

  @Test
  public void savingBookSavesAuthors() {
    BookManyJ book = new BookManyJ();
    AuthorManyJ author1 = new AuthorManyJ();
    author1.setName("marko");

    AuthorManyJ author2 = new AuthorManyJ();
    author2.setName("janko");

    book.addAuthor(author1);
    book.addAuthor(author2);

    //org.springframework.orm.jpa.JpaSystemException: Could not set field value [SHORT_CIRCUIT_INDICATOR]
    // value by reflection :
    // [class me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookAuthorId.authorId]
    // setter of
    // me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookAuthorId.authorId;
    // nested exception is org.hibernate.PropertyAccessException: Could not set field value
    // [SHORT_CIRCUIT_INDICATOR] value by reflection :
    // [class me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookAuthorId.authorId]
    // setter of
    // me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookAuthorId.authorId
    service.saveBook(book);
  }
}
