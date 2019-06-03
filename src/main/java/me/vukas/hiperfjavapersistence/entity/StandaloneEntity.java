package me.vukas.hiperfjavapersistence.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class StandaloneEntity {
    @Id
    private Integer id;
    private String name;
}
