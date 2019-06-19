package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@NoArgsConstructor
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
