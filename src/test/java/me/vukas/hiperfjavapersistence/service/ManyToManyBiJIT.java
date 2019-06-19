package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.AuthorManyJ;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookManyJ;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

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

    author1 = service.saveAuthor(author1);
    author2 = service.saveAuthor(author2);

   /*
    service.saveBook(book);

    book.addAuthor(author1);
    book.addAuthor(author2);

    service.saveBook(book);
    */

    service.addAuthorsToBook(book, author1, author2);

    //remove author2 from book
    //service.removeAuthorFromBook(book.getId(), author2.getId());

    //remove author2 from book
    service.removeAuthorInTrans(book, author2);

    service.getBook(book.getId()).ifPresent(b -> {
      assertThat(b.getId()).isEqualTo(1);
    });
  }
}
