package me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.onetomany;

import java.util.List;
import javax.persistence.EntityManager;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.SomeEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.transaction.annotation.Transactional;

public class CustomizedPostOneBiRepositoryImpl implements CustomizedPostOneBiRepository {

  private final EntityManager entityManager;

  /**
   * Determine which EntityManager to inject (if we have multiple em-s - eg one for MYSQL and one for
   * MongoDB) based on Entity class - it will find which entity manager is responsible for this
   * PostOneBi.class and inject correct entity manager
   * @param context
   */
  public CustomizedPostOneBiRepositoryImpl(JpaContext context) {
    this.entityManager = context.getEntityManagerByManagedType(PostOneBi.class);
  }

  @Transactional(readOnly = true) //so we don't see difference between queries in this method
  @Override
  public Page<PostOneBi> findAllByEnumeration(SomeEnum enumeration, Pageable pageable) {

    Long totalPosts = entityManager
        .createQuery("select count(p.id) from PostOneBi p WHERE p.enumeration=:enumeration ", Long.class)
        .setParameter(
            "enumeration",
            enumeration
        )
        .getSingleResult();

    List<Long> postIds = entityManager
        .createQuery(
            "select p.id from PostOneBi p WHERE p.enumeration=:enumeration ", Long.class)
        .setParameter(
            "enumeration",
            enumeration
        )
        .setMaxResults(pageable.getPageSize())
        .setFirstResult(pageable.getPageNumber() * pageable.getPageSize())
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

    return new PageImpl<>(posts, pageable, totalPosts);

  }
}
