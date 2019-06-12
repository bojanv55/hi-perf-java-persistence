package me.vukas.hiperfjavapersistence.entity.relationship.onetomany;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class PostOneUni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PostCommentUniMany> comments = new HashSet<>();

    public void addComment(PostCommentUniMany comment){
        this.comments.add(comment);
    }

    public void removeComment(PostCommentUniMany comment){
        this.comments.remove(comment);
    }
}
