package me.vukas.hiperfjavapersistence.entity.relationship.manytoone;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class PostOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
