package me.vukas.hiperfjavapersistence.entity.inheritance.tableperclass;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Child2TPC extends ParentTPC {
  private String child2Prop;
}
