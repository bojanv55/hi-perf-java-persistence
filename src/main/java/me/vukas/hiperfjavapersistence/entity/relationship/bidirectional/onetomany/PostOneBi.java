package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class PostOneBi {  //BEST WAY TO MAP @OneToMany (if only @ManyToOne is not enough)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  //mappedBy = "post" --> post is attribute name inside PostCommentManyBi class (private PostOneBi post;)
  //cascade - entity state transitions are cascaded from PostOneBi to PostCommentManyBi
  //orphanRemoval - when we set post field on PostCommentManyBi to null, that postCommentManyBi will be removed from db
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
