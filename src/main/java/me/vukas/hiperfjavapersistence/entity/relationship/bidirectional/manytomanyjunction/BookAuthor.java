package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(exclude = "id")
@ToString(exclude = "id")
@Entity
public class BookAuthor {
  @Id
  private BookAuthorId id;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("bookId")
  private BookManyJ book;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("authorId")
  private AuthorManyJ author;
}
