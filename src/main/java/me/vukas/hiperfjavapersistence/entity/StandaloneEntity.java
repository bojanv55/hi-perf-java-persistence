package me.vukas.hiperfjavapersistence.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true) //force - all final fields are initialized with 0 / false / null
@Entity
public class StandaloneEntity {
    @Id
    private final Integer id;
    private final String name;
}
