package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetoone.PostOneToOneBi;
import me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.onetoone.PostOneToOneBiRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OneToOneBiService {

    private PostOneToOneBiRepository repository;

    public OneToOneBiService(PostOneToOneBiRepository repository) {
        this.repository = repository;
    }

    public void savePost(PostOneToOneBi post){
        repository.save(post);
    }

    public Optional<PostOneToOneBi> loadPost(Long id){
        return repository.findById(id);
    }
}
