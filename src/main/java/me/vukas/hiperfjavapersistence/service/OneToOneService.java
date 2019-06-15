package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.onetoone.PostDetailsOne;
import me.vukas.hiperfjavapersistence.entity.relationship.onetoone.PostOneToOne;
import me.vukas.hiperfjavapersistence.repository.relationship.onetoone.PostDetailsOneRepository;
import me.vukas.hiperfjavapersistence.repository.relationship.onetoone.PostOneToOneRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OneToOneService {

    private PostOneToOneRepository postOneToOneRepository;
    private PostDetailsOneRepository postDetailsOneRepository;

    public OneToOneService(PostOneToOneRepository postOneToOneRepository, PostDetailsOneRepository postDetailsOneRepository) {
        this.postOneToOneRepository = postOneToOneRepository;
        this.postDetailsOneRepository = postDetailsOneRepository;
    }

    public void savePostOne(PostOneToOne post){
        postOneToOneRepository.save(post);
    }

    public void savePostDetails(PostDetailsOne details){
        postDetailsOneRepository.save(details);
    }

    public Optional<PostOneToOne> loadPostOne(Long id){
        return postOneToOneRepository.findById(id);
    }

    public Optional<PostDetailsOne> loadPostDetails(Long id){
        return postDetailsOneRepository.findById(id);
    }
}
