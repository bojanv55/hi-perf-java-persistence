package me.vukas.hiperfjavapersistence.repository.relationship.manytoone;

import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostOne;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOneRepository extends SelectivelyExposingRepository<PostOne, Long> {
}
