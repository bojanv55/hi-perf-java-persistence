package me.vukas.hiperfjavapersistence.entity.relationship.manytoone;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PostCommentMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private PostOne post;

    public void commentToPost(PostOne post){
        this.post = post;
    }
}
