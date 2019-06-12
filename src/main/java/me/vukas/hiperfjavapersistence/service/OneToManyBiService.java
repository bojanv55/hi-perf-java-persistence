package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.onetomany.PostOneBiRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OneToManyBiService {
    private PostOneBiRepository postOneRepo;

    public OneToManyBiService(PostOneBiRepository postOneRepo) {
        this.postOneRepo = postOneRepo;
    }

    public PostOneBi addNewPost(PostOneBi post){
        return postOneRepo.save(post);
    }

    public PostOneBi changePost(PostOneBi post){
        return postOneRepo.save(post);
    }

    public Optional<PostOneBi> getPostById(Long postId){
        return postOneRepo.loadPostsByIdEagerlyWithSort(postId);
    }
}
