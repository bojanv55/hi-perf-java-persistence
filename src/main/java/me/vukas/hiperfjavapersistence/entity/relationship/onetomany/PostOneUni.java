package me.vukas.hiperfjavapersistence.entity.relationship.onetomany;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class PostOneUni {   //BETTER USE PostOneBi @OneToMany mapping (bidirectional)

    @EmbeddedId //if @Id, class CompositeId must be annotated @Embeddable?
    private CompositeId id;

    @Embedded
    private CombinationOfAttribs combination;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumns({
            @JoinColumn(name = "post_id1"),
            @JoinColumn(name = "post_id2")
    })
    private Set<PostCommentUniMany> comments = new HashSet<>();

    @Version
    private Integer version;

    public void addComment(PostCommentUniMany comment){
        this.comments.add(comment);
    }

    public void removeComment(PostCommentUniMany comment){
        this.comments.remove(comment);
    }
}
