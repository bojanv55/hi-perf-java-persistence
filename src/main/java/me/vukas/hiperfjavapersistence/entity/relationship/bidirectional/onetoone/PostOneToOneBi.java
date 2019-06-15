package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetoone;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PostOneToOneBi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //even if LAZY, it always loads details - so not the fastest way to map one-to-one
    @OneToOne(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            optional = false
    )
    private PostDetailsOneBi details;

    private String content;

    public void setDetails(PostDetailsOneBi details){
        if(details == null){
            if(this.details != null){
                this.details.setPost(null); //flag other side to be orphan removed, id null passed to this method
            }
        }
        else{
            details.setPost(this);  //set details parent to this one
        }
        this.details = details; //set details to new details (or null if null passed to method)
    }
}