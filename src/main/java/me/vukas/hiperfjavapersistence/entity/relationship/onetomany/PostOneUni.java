package me.vukas.hiperfjavapersistence.entity.relationship.onetomany;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class PostOneUni {
    @EmbeddedId //if @Id, class CompositeId must be annotated @Embeddable?
    private CompositeId id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumns({
            @JoinColumn(name = "post_id1"),
            @JoinColumn(name = "post_id2")
    })
    private Set<PostCommentUniMany> comments = new HashSet<>();

    public void addComment(PostCommentUniMany comment){
        this.comments.add(comment);
    }

    public void removeComment(PostCommentUniMany comment){
        this.comments.remove(comment);
    }
}
