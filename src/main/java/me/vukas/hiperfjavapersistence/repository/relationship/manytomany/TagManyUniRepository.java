package me.vukas.hiperfjavapersistence.repository.relationship.manytomany;

import java.util.Set;
import me.vukas.hiperfjavapersistence.entity.relationship.manytomany.TagManyUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagManyUniRepository extends JpaRepository<TagManyUni, Long> {
  Set<TagManyUni> findAllByNameIn(Set<String> names);
}
