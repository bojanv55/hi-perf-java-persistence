package me.vukas.hiperfjavapersistence.repository;

import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOneRepository extends JpaRepository<PostOne, Long> {
}
