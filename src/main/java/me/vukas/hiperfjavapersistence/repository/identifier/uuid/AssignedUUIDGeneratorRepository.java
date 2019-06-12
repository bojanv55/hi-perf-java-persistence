package me.vukas.hiperfjavapersistence.repository.identifier.uuid;

import me.vukas.hiperfjavapersistence.entity.identifier.uuid.AssignedUUIDGenerator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssignedUUIDGeneratorRepository extends JpaRepository<AssignedUUIDGenerator, UUID> {
}
