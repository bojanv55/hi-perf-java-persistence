package me.vukas.hiperfjavapersistence.entity.inheritance.jointable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Data;

//create table child1jt (
//    child1prop varchar(255),
//    id bigint not null,
//    primary key (id)
//    ) engine=InnoDB
//
//    create table parent_jt (
//    id bigint not null auto_increment,
//    name varchar(255),
//    primary key (id)
//    ) engine=InnoDB

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ParentJt {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
}
