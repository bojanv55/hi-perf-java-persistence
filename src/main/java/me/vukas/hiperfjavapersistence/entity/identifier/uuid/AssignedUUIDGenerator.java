package me.vukas.hiperfjavapersistence.entity.identifier.uuid;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class AssignedUUIDGenerator {
    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id; //needs to be set before saving
}
