package me.vukas.hiperfjavapersistence.entity.identifier.numerical;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class SequenceGenerator {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;    //generated in db (if not supported from table hibernate_sequence). Selects next_val and inserts.
}
