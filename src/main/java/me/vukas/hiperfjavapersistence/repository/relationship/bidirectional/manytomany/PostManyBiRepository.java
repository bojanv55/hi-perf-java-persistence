package me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.manytomany;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany.PostManyBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostManyBiRepository extends JpaRepository<PostManyBi, Long> {
}

