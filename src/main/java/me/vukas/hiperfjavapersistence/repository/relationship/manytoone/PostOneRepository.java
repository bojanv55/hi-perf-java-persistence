package me.vukas.hiperfjavapersistence.repository.relationship.manytoone;

import java.util.Optional;
import me.vukas.hiperfjavapersistence.dto.manytoone.PostOneDtoRead;
import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostOne;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOneRepository extends SelectivelyExposingRepository<PostOne, Long> {
  @Query("SELECT new me.vukas.hiperfjavapersistence.dto.manytoone.PostOneDtoRead(p.id, p.content, p.otherAttribs) FROM PostOne p")
  Optional<PostOneDtoRead> projectPostOne(Long id);
}
