package me.vukas.hiperfjavapersistence.entity.relationship.onetomany;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class PostCommentUniMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(!(o instanceof PostCommentUniMany)){
            return false;
        }
        PostCommentUniMany pc = (PostCommentUniMany)o;
        return id != null && id.equals(pc.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
