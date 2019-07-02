package me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.onetomany;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomizedPostOneBiRepository {
  Page<PostOneBi> findAll(Pageable pageable);
}
