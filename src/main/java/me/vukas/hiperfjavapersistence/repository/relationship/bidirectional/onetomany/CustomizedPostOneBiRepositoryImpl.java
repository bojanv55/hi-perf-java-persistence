package me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.onetomany;

import static org.hibernate.jpa.QueryHints.HINT_PASS_DISTINCT_THROUGH;

import java.util.List;
import javax.persistence.EntityManager;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.SomeEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.data.jpa.repository.query.QueryUtils;
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

    Long total = entityManager
        .createQuery("SELECT COUNT(p) FROM PostOneBi p WHERE p.enumeration=:enumeration", Long.class)
        .setParameter("enumeration", enumeration)
        .getSingleResult();

    String pIdsQry = "SELECT p.id FROM PostOneBi p WHERE p.enumeration=:enumeration";
    pIdsQry = QueryUtils.applySorting(pIdsQry, pageable.getSort());
    List<Long> postIds = entityManager
        .createQuery(pIdsQry, Long.class)
        .setParameter("enumeration", enumeration)
        .setMaxResults(pageable.getPageSize())
        .setFirstResult(pageable.getPageNumber() * pageable.getPageSize())
        .getResultList();

    String pQry = "SELECT DISTINCT p FROM PostOneBi p LEFT JOIN FETCH p.comments WHERE p.id IN (:postIds)";
    pQry = QueryUtils.applySorting(pQry, pageable.getSort());
    List<PostOneBi> posts = entityManager
        .createQuery(pQry, PostOneBi.class)
        .setParameter("postIds", postIds)
        .setHint(HINT_PASS_DISTINCT_THROUGH,false)
        .getResultList();

    return new PageImpl<>(posts, pageable, total);
  }
}
