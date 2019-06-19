package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class BookManyBi {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  //using SET, we don't need to re-insert elements, if order needed use @OrderBy or @OrderColumn
  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  private Set<AuthorManyBi> authors = new HashSet<>();

  public void addAuthor(AuthorManyBi author){
    author.getBooks().add(this);
    authors.add(author);
  }

  public void removeAuthor(AuthorManyBi author){
    author.getBooks().remove(this);
    authors.remove(author);
  }

  @Override
  public boolean equals(Object o) {
    if(o == this){
      return true;
    }
    if(!(o instanceof BookManyBi)){
      return false;
    }
    BookManyBi b = (BookManyBi)o;
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
