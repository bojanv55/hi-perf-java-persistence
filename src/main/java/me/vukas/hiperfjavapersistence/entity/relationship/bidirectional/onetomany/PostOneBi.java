package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany;

import java.time.LocalDateTime;
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
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.UpdateTimestamp;

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

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;

  //mappedBy = "post" --> post is attribute name inside PostCommentManyBi class (private PostOneBi post;)
  //cascade - entity state transitions are cascaded from PostOneBi to PostCommentManyBi
  //orphanRemoval - when we set post field on PostCommentManyBi to null, that postCommentManyBi will be removed from db
  @ToString.Exclude //do not create stack overflow (since we have bi-relation)
  @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
  //this will generate this DDL when creating schema automatically
  //alter table post_comment_many_bi
  //       add constraint FKqdjuhsgs3opnlxt26s15u0yqf
  //       foreign key (post_id)
  //       references post_one_bi (id)
  //       on delete cascade
  //IT IS NOT NEEDED IN CASE WE WANT TO MANUALLY SPECIFY FK CONSTRAINTS
  //EITHER IN LIQUIBASE FILE OR MANUALLY IN SQL CREATION SCRIPTS
  @OnDelete(action = OnDeleteAction.CASCADE)
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
