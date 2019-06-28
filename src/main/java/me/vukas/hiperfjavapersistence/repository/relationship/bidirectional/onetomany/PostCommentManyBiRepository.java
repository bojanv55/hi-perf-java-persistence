package me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.onetomany;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostCommentManyBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentManyBiRepository extends JpaRepository<PostCommentManyBi, Long> {

}
