package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = "id")
@ToString(exclude = "id")
@NoArgsConstructor
@Entity
public class BookAuthor {
  @Id
  private BookAuthorId id;

  public BookAuthor(BookManyJ book, AuthorManyJ author) {
    this.book = book;
    this.author = author;
    this.id = new BookAuthorId(book.getId(), author.getId());
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("bookId")
  private BookManyJ book;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("authorId")
  private AuthorManyJ author;
}
