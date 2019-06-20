package me.vukas.hiperfjavapersistence.repository.inheritance.tableperclass;

import me.vukas.hiperfjavapersistence.entity.inheritance.tableperclass.ParentTPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentTPCRepository extends JpaRepository<ParentTPC, Long> {
}
