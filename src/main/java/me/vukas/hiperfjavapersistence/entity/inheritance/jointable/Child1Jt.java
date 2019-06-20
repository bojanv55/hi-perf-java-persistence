package me.vukas.hiperfjavapersistence.entity.inheritance.jointable;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Child1Jt extends ParentJt {
  private String child1Prop;
}
