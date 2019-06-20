package me.vukas.hiperfjavapersistence.service;

import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.CompositeId;
import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.PostOneUni;
import me.vukas.hiperfjavapersistence.repository.relationship.onetomany.PostOneUniRepository;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

@Service
public class OneToManyService {
    private PostOneUniRepository postOneRepo;

    public OneToManyService(PostOneUniRepository postOneRepo) {
        this.postOneRepo = postOneRepo;
    }

    @Transactional
    public PostOneUni addNewPost(PostOneUni post){
        return postOneRepo.save(post);
    }

    @Transactional
    public PostOneUni changePost(PostOneUni post){
        return postOneRepo.save(post);
    }

    @Transactional
    public Optional<PostOneUni> getPostById(CompositeId postId){
        return postOneRepo.findById(postId).map(p -> {
            //SHOULD NOT BE USED THIS WAY, SINCE LOADS COMMENTS SEPARATELY
            Hibernate.initialize(p.getComments());  //initialize lazily comments inside transaction
            return Optional.of(p);
        }).orElse(Optional.empty());
    }
}
