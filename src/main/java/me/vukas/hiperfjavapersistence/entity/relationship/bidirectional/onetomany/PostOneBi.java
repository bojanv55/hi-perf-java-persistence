package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
public class PostOneBi {  //BEST WAY TO MAP @OneToMany (if only @ManyToOne is not enough)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  private SomeEnum enumeration;

  private String updateThis;

  private String dontUpdateThis;

  private Long updatedProgrammatically = 123L;

  //mappedBy = "post" --> post is attribute name inside PostCommentManyBi class (private PostOneBi post;)
  //cascade - entity state transitions are cascaded from PostOneBi to PostCommentManyBi
  //orphanRemoval - when we set post field on PostCommentManyBi to null, that postCommentManyBi will be removed from db
  @ToString.Exclude //do not create stack overflow (since we have bi-relation)
  @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<PostCommentManyBi> comments = new HashSet<>();

  public void addComment(PostCommentManyBi comment){
    comments.add(comment);
    comment.setPost(this);
  }

  public void removeComment(PostCommentManyBi comment){
    comments.remove(comment);
    comment.setPost(null);  //make this comment orphan, that will be removed from db
  }
}
