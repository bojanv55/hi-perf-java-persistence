package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class AuthorManyJ {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<BookAuthor> books = new HashSet<>();

  @Override
  public boolean equals(Object o) {
    if(o == this){
      return true;
    }
    if(!(o instanceof AuthorManyJ)){
      return false;
    }
    AuthorManyJ a = (AuthorManyJ)o;
    return Objects.equals(name, a.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
