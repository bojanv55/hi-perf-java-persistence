package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.elementcollection.PostWithCollection;
import me.vukas.hiperfjavapersistence.repository.jpa.relationship.elementcollection.PostWithCollectionRepository;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
public class PostWithCollectionService {

    private PostWithCollectionRepository repository;

    public PostWithCollectionService(PostWithCollectionRepository repository) {
        this.repository = repository;
    }

    public PostWithCollection save(PostWithCollection post){
        return repository.save(post);
    }

    @Transactional
    public Optional<PostWithCollection> getById(Long id){
        return repository.findById(id).map(p -> {
            //SHOULD NOT BE USED THIS WAY, SINCE LOADS SEPARATELY
            Hibernate.initialize(p.getListOfStrings());
            Hibernate.initialize(p.getListOfComplex());
            return Optional.of(p);
        }).orElse(Optional.empty());
    }
}
