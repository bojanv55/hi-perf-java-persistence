package me.vukas.hiperfjavapersistence.entity.relationship.onetoone;

import lombok.Data;

import javax.persistence.*;

//create table post_details_one (
//        details varchar(255),
//        post_id bigint not null,
//        primary key (post_id)
//        ) engine=InnoDB

@Data
@Entity
public class PostDetailsOne {
    @Id
    private Long id;    //this will use value of post_id

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private PostOneToOne post;   //setting post to details - seems unnatural

    private String details;
}
