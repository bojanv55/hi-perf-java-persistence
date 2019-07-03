package me.vukas.hiperfjavapersistence.repository.jpa.inheritance.mappedsuperclass;

import me.vukas.hiperfjavapersistence.entity.inheritance.mappedsuperclass.Child2Ms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Child2MsRepository extends JpaRepository<Child2Ms, Long> {
}
