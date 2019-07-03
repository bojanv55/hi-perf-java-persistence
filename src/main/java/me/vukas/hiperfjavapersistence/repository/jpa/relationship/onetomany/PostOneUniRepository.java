package me.vukas.hiperfjavapersistence.repository.jpa.relationship.onetomany;

import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.CompositeId;
import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.PostOneUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOneUniRepository extends JpaRepository<PostOneUni, CompositeId> {
}
