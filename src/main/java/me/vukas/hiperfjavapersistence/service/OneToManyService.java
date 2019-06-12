package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.CompositeId;
import me.vukas.hiperfjavapersistence.entity.relationship.onetomany.PostOneUni;
import me.vukas.hiperfjavapersistence.repository.relationship.onetomany.PostOneUniRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

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

    public Optional<PostOneUni> getPostById(CompositeId postId){
        return postOneRepo.findById(postId);
    }
}
