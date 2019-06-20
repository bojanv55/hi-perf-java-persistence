package me.vukas.hiperfjavapersistence.repository.inheritance.jointable;

import me.vukas.hiperfjavapersistence.entity.inheritance.jointable.ParentJt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentJtRepository extends JpaRepository<ParentJt, Long> {
}
