package me.vukas.hiperfjavapersistence.repository.identifier.numerical;

import me.vukas.hiperfjavapersistence.entity.identifier.numerical.SequenceGenerator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SequenceGeneratorRepository extends JpaRepository<SequenceGenerator, Long> {
}
