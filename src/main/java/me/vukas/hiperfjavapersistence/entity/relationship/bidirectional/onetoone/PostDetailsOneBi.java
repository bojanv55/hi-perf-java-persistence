package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetoone;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PostDetailsOneBi {
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private PostOneToOneBi post;

    private String details;
}
