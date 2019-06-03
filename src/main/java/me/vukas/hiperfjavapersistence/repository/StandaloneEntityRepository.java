package me.vukas.hiperfjavapersistence.repository;

import me.vukas.hiperfjavapersistence.entity.StandaloneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandaloneEntityRepository extends JpaRepository<StandaloneEntity, Integer> {
}
