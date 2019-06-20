package me.vukas.hiperfjavapersistence.entity.inheritance.singletable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Data;

//create table parent_st (
//    dtype varchar(31) not null,
//    id bigint not null auto_increment,
//    name varchar(255),
//    child1prop varchar(255),
//    child2prop varchar(255),
//    primary key (id)
//    ) engine=InnoDB

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //SINGLE_TABLE is default, so not needed
public class ParentSt {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
}
