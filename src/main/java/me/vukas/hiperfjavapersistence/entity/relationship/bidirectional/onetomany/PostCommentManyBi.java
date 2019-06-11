package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class PostCommentManyBi {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
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
   * In case that we use id here, initially it will be null and after persisted with AUTO_INCREMENT it will be changed.
   * In ths situation - this object that was added in some HashSet etc. will potentially not be found in the future since
   * its hashCode changed while the object was inside HashSet.
   * @return 31
   */
  @Override
  public int hashCode() {
    return 31;
  }
}
