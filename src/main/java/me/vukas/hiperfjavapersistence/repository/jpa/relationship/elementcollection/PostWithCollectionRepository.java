package me.vukas.hiperfjavapersistence.repository.jpa.relationship.elementcollection;

import me.vukas.hiperfjavapersistence.entity.relationship.elementcollection.PostWithCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostWithCollectionRepository extends JpaRepository<PostWithCollection, Long> {
}

