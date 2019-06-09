package me.vukas.hiperfjavapersistence.repository;

import me.vukas.hiperfjavapersistence.entity.identifier.numerical.TableGenerator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableGeneratorRepository extends JpaRepository<TableGenerator, Long> {
}
