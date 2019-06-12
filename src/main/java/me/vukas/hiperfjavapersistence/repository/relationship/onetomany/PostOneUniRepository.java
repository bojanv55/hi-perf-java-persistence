package me.vukas.hiperfjavapersistence.repository.relationship.onetomany;

import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.PostOneUni;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostOneUniRepository extends JpaRepository<PostOneUni, Long> {
    @Override
    @EntityGraph(attributePaths = "comments")
    Optional<PostOneUni> findById(Long id);
}
