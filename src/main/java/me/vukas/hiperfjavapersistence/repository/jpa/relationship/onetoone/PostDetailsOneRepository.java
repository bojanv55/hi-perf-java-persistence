package me.vukas.hiperfjavapersistence.repository.jpa.relationship.onetoone;

import me.vukas.hiperfjavapersistence.entity.relationship.onetoone.PostDetailsOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDetailsOneRepository extends JpaRepository<PostDetailsOne, Long> {
}

