package me.vukas.hiperfjavapersistence.repository.jpa.inheritance.mappedsuperclass;

import me.vukas.hiperfjavapersistence.entity.inheritance.mappedsuperclass.ParentMs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentMsRepository extends JpaRepository<ParentMs, Long> {
}
