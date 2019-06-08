package me.vukas.hiperfjavapersistence.repository;

import me.vukas.hiperfjavapersistence.entity.identifier.uuid.UUIDGenerator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UUIDGeneratorRepository extends JpaRepository<UUIDGenerator, UUID> {
}
