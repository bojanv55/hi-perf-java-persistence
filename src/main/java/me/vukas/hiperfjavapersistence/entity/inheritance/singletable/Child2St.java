package me.vukas.hiperfjavapersistence.entity.inheritance.singletable;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Child2St extends ParentSt {
  private String child2Prop;
}
