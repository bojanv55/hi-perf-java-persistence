package me.vukas.hiperfjavapersistence.entity.relationship.manytomany;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class TagManyUni {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NaturalId
  private String name;

  public TagManyUni(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if(o == this){
      return true;
    }
    if(!(o instanceof TagManyUni)){
      return false;
    }
    TagManyUni tg = (TagManyUni)o;
    return Objects.equals(name, tg.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
