package me.vukas.hiperfjavapersistence.repository.relationship.manytoone;

import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostCommentMany;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentManyRepository extends SelectivelyExposingRepository<PostCommentMany, Long> {
}
