package me.vukas.hiperfjavapersistence.repository.jpa.relationship.manytomany;

import me.vukas.hiperfjavapersistence.entity.relationship.manytomany.PostManyUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostManyUniRepository extends JpaRepository<PostManyUni, Long> {
}
