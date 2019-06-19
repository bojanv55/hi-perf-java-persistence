package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Data
@Entity
public class BookManyJ {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<BookAuthor> authors = new HashSet<>();

  public void addAuthor(AuthorManyJ author){
    BookAuthor bookAuthor = new BookAuthor(this, author);
    authors.add(bookAuthor);
    author.getBooks().add(bookAuthor);
  }

  public void removeAuthor(AuthorManyJ author){
    for(Iterator<BookAuthor> iterator = authors.iterator(); iterator.hasNext();){
      BookAuthor bookAuthor = iterator.next();
      if(bookAuthor.getBook().equals(this) && bookAuthor.getAuthor().equals(author)){
        iterator.remove();
        bookAuthor.getAuthor().getBooks().remove(bookAuthor);
        bookAuthor.setAuthor(null);
        bookAuthor.setBook(null);
      }
    }
  }

  @Override
  public boolean equals(Object o) {
    if(o == this){
      return true;
    }
    if(!(o instanceof BookManyJ)){
      return false;
    }
    BookManyJ b = (BookManyJ)o;
    //while object is still not persisted to DB (null) we cannot compare it to any other object (except by reference (o == this))
    return id != null && id.equals(b.id);
  }

  /**
   * In case that we use id here, initially it will be null and after it is persisted with AUTO_INCREMENT it will be changed.
   * In ths situation - this object that was added in some HashSet etc. will potentially not be found in the future since
   * its hashCode changed while the object was inside HashSet.
   * @return 31
   */
  @Override
  public int hashCode() {
    return 31;
  }
}
