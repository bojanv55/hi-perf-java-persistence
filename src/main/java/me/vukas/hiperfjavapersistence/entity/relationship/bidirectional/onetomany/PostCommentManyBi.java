package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PostCommentManyBi {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String content;

  private String updateThis;

  private String dontUpdateThis;

  private Long updatedProgrammatically = 456L;

  @ManyToOne(fetch = FetchType.LAZY)  //eager is default
  @JoinColumn(name = "post_id")
  private PostOneBi post;

  @Override
  public boolean equals(Object o) {
    if(o == this){
      return true;
    }
    if(!(o instanceof PostCommentManyBi)){
      return false;
    }
    PostCommentManyBi pc = (PostCommentManyBi)o;
    //while object is still not persisted to DB (null) we cannot compare it to any other object (except by reference (o == this))
    return id != null && id.equals(pc.id);
  }

  /**
   * In case that we use id here, initially it will be null and after it is persisted with AUTO_INCREMENT it will be changed.
   * In ths situation - this object that was added in some HashSet etc. will potentially not be found in the future since
   * its hashCode changed while the object was inside HashSet.
   * @return 31
   */
  @Override
  public int hashCode() {
    return 31;
  }
}
