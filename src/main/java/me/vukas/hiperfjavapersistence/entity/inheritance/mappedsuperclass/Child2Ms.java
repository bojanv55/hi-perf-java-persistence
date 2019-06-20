package me.vukas.hiperfjavapersistence.entity.inheritance.mappedsuperclass;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Child2Ms extends ParentMs {
  private String child2Prop;
}
