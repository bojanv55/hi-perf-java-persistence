package me.vukas.hiperfjavapersistence.entity.inheritance.singletable;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Child1St extends ParentSt {
  private String child1Prop;
}
