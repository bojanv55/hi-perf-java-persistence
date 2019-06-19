package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

@Data
@Entity
public class AuthorManyBi {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NaturalId
  private String name;

  //using SET, we don't need to re-insert elements, if order needed use @OrderBy or @OrderColumn
  @ManyToMany(mappedBy = "authors")  //property name in PostManyBi
  private Set<BookManyBi> books = new HashSet<>();

  public AuthorManyBi(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if(o == this){
      return true;
    }
    if(!(o instanceof AuthorManyBi)){
      return false;
    }
    AuthorManyBi a = (AuthorManyBi)o;
    return Objects.equals(name, a.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
