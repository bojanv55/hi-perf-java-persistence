package me.vukas.hiperfjavapersistence.entity.identifier.numerical;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class TableGenerator {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;    //selects identity from table "hibernate_sequences". Needs locking and is not scalable!
}
