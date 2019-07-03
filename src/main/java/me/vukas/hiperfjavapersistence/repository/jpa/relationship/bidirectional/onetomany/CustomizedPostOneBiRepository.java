package me.vukas.hiperfjavapersistence.repository.jpa.relationship.bidirectional.onetomany;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.SomeEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomizedPostOneBiRepository {
  Page<PostOneBi> findAllByEnumeration(SomeEnum enumeration, Pageable pageable);
}
