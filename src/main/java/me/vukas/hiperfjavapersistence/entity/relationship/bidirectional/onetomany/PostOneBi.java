package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class PostOneBi {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  //mappedBy = "post" --> post is attribute name inside PostCommentManyBi class (private PostOneBi post;)
  //cascade - entity state transitions are cascaded from PostOneBi to PostCommentManyBi
  //orphanRemoval - when we set post field on PostCommentManyBi to null, that postCommentManyBi will be removed from db
  @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<PostCommentManyBi> comments = new HashSet<>();
}