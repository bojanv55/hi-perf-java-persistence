package me.vukas.hiperfjavapersistence.entity.inheritance.mappedsuperclass;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Child1Ms extends ParentMs {
  private String child1Prop;
}
