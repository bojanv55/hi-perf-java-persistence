package me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.onetomany;

import static org.hibernate.jpa.QueryHints.HINT_PASS_DISTINCT_THROUGH;

import java.util.List;
import java.util.Optional;
import javax.persistence.QueryHint;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi_;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.SomeEnum;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * Instead of extending JpaRepository (and exposing all of its methods), just expose methods specified
 * in this interface
 */
@RepositoryDefinition(domainClass = PostOneBi.class, idClass = Long.class)
public interface PostOneBiRepository extends CustomizedPostOneBiRepository {

  /**
   * Method that allows eager fetching of comments (like method below), but using Query
   */
  @Query("SELECT p FROM PostOneBi p LEFT JOIN FETCH p.comments WHERE p.id=:id")
  Optional<PostOneBi> loadPostsByIdEagerly(Long id);

  @Query("SELECT p FROM PostOneBi p LEFT JOIN FETCH p.comments c WHERE p.id=:id ORDER BY c.id DESC")
  Optional<PostOneBi> loadPostsByIdEagerlyWithSort(Long id);

  //if using Set<> deduplication is implicit (so we don't need DISTINCT in qry and hints)
  @QueryHints(@QueryHint(name = HINT_PASS_DISTINCT_THROUGH, value = "false"))
  @Query("SELECT DISTINCT p FROM PostOneBi p LEFT JOIN FETCH p.comments c WHERE p.enumeration=:enumeration AND c.content='two'")
  List<PostOneBi> loadByEnumeration(SomeEnum enumeration);

  Iterable<PostOneBi> findAll(Sort sort);

  //we will implement this in customized repo
//  @Query(value = "SELECT * FROM post_one_bi p JOIN post_comment_many_bi pcmb on p.id = pcmb.post_id WHERE p.id IN (SELECT p.id FROM post_one_bi p WHERE p.id<100)",
//  countQuery = "SELECT COUNT(p.id) FROM post_one_bi p WHERE p.id<100", nativeQuery = true)
//  Page<PostOneBi> findAll(Pageable pageable);

  /**
   * Overrides default behavior of findById method - instead of lazy fetching comments, it will now
   * do that eagerly. Inside attributePaths we specify attributes that should be JOINED during
   * fetching.
   */
  @EntityGraph(attributePaths = PostOneBi_.COMMENTS)  //using generated static fields from hibernate jpamodelgen
  Optional<PostOneBi> findById(Long id);

  /**
   * Since using JPA, this definition is routed to SimpleJpaRepository implementation
   */
  PostOneBi save(PostOneBi post);
}
