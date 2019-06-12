package me.vukas.hiperfjavapersistence.repository;

import java.util.Optional;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOneBiRepository extends JpaRepository<PostOneBi, Long> {

  /**
   * Method that allows eager fetching of comments (like method below), but using Query
   */
  @Query("SELECT p FROM PostOneBi p LEFT JOIN FETCH p.comments WHERE p.id=:id")
  Optional<PostOneBi> loadPostsByIdEagerly(Long id);

  @Query("SELECT p FROM PostOneBi p LEFT JOIN FETCH p.comments c WHERE p.id=:id ORDER BY c.id DESC")
  Optional<PostOneBi> loadPostsByIdEagerlyWithSort(Long id);

  /**
   * Overrides default behavior of findById method - instead of lazy fetching comments, it will now
   * do that eagerly. Inside attributePaths we specify attributes that should be JOINED during
   * fetching.
   */
  @Override
  @EntityGraph(attributePaths = "comments")
  Optional<PostOneBi> findById(Long id);
}
