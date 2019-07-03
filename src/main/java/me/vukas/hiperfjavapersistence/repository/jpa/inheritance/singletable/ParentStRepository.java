package me.vukas.hiperfjavapersistence.repository.jpa.inheritance.singletable;

import me.vukas.hiperfjavapersistence.entity.inheritance.singletable.ParentSt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentStRepository extends JpaRepository<ParentSt, Long> {
}
