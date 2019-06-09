package me.vukas.hiperfjavapersistence.repository;

import me.vukas.hiperfjavapersistence.entity.identifier.numerical.IdentityGenerator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentityGeneratorRepository extends JpaRepository<IdentityGenerator, Long> {
}