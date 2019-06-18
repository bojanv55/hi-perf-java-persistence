package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany.BookManyBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany.AuthorManyBi;
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
  public void savingBookSavesAuthors(){
    BookManyBi book = new BookManyBi();
    book.addAuthor(new AuthorManyBi("Pavel"));
    book.addAuthor(new AuthorManyBi("Janko"));
    book.addAuthor(new AuthorManyBi("Marko"));

    service.saveBook(book);

    book.removeAuthor(new AuthorManyBi("Janko"));

    service.saveBook(book);
  }
}
