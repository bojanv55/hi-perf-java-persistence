package me.vukas.hiperfjavapersistence.entity.inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Data;

//create table parenttpc (
//    id bigint not null,
//    name varchar(255),
//    primary key (id)
//    ) engine=InnoDB
//
//    create table child1tpc (
//    id bigint not null,
//    name varchar(255),
//    child1prop varchar(255),
//    primary key (id)
//    ) engine=InnoDB

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ParentTPC {
  @Id
  //if IDENTITY, that means that each table would be able to have same id 2 times, which would
  //break inheritance (possible to have 2 different parents with same ID)
  @GeneratedValue(strategy = GenerationType.TABLE)  //Cannot be IDENTITY
  private Long id;

  private String name;
}
