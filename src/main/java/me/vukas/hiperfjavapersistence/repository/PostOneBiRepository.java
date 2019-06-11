package me.vukas.hiperfjavapersistence.repository;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOneBiRepository extends JpaRepository<PostOneBi, Long> {
    //@Query("SELECT p FROM PostOneBi LEFT JOIN FETCH p.comments WHERE p.id=:id")
    //Optional<PostOneBi> findById(@Param("id") Long id);
}
