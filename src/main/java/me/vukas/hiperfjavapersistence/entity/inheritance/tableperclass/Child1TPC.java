package me.vukas.hiperfjavapersistence.entity.inheritance.tableperclass;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Child1TPC extends ParentTPC {
  private String child1Prop;
}
