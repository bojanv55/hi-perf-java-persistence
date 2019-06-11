package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class PostOneBi {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  //mappedBy = "post" --> post is attribute name inside PostCommentManyBi class (private PostOneBi post;)
  @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<PostCommentManyBi> comments = new HashSet<>();
}
