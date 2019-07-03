package me.vukas.hiperfjavapersistence.repository.jpa.relationship.bidirectional.onetoone;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetoone.PostOneToOneBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOneToOneBiRepository extends JpaRepository<PostOneToOneBi, Long> {
}

