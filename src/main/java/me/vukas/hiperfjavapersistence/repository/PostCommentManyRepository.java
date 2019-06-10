package me.vukas.hiperfjavapersistence.repository;

import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostCommentMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentManyRepository extends JpaRepository<PostCommentMany, Long> {
}
