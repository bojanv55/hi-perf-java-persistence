package me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.onetomany;

import java.util.List;
import javax.persistence.EntityManager;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaContext;

public class CustomizedPostOneBiRepositoryImpl implements CustomizedPostOneBiRepository {

  private final EntityManager entityManager;

  /**
   * Determine which entitymanager to inject (if we have multiple em-s - eg one for MYSQL and one for
   * MongoDB) based on Entity class - it will find which entity manager is responsible for this
   * PostOneBi.class and inject correct entity manager
   * @param context
   */
  public CustomizedPostOneBiRepositoryImpl(JpaContext context) {
    this.entityManager = context.getEntityManagerByManagedType(PostOneBi.class);
  }

  @Override
  public Page<PostOneBi> findAll(Pageable pageable) {

    List<Long> postIds = entityManager
        .createQuery(
            "select p.id from PostOneBi p ", Long.class)
//        .setParameter(
//            "titlePattern",
//            "High-Performance Java Persistence %"
//        )
        //.setMaxResults(pageable.getPageSize())
        .getResultList();

    List<PostOneBi> posts = entityManager
        .createQuery(
            "select distinct p " +
                "from PostOneBi p " +
                "left join fetch p.comments " +
                "where p.id in (:postIds)", PostOneBi.class)
        .setParameter("postIds", postIds)
        .setHint(
            "hibernate.query.passDistinctThrough",
            false
        )
        .getResultList();

    return new PageImpl<>(posts, Pageable.unpaged(), postIds.size());

  }
}
