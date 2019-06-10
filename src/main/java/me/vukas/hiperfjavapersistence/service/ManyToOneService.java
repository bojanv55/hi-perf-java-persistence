package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostCommentMany;
import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostOne;
import me.vukas.hiperfjavapersistence.repository.PostCommentManyRepository;
import me.vukas.hiperfjavapersistence.repository.PostOneRepository;
import org.springframework.stereotype.Service;

@Service
public class ManyToOneService {
    private PostOneRepository postOneRepo;
    private PostCommentManyRepository postCommentRepo;

    public ManyToOneService(PostOneRepository postOneRepo, PostCommentManyRepository postCommentRepo) {
        this.postOneRepo = postOneRepo;
        this.postCommentRepo = postCommentRepo;
    }

    public PostCommentMany addNewCommentForPost(PostCommentMany comment, Long postId){
        return postOneRepo.findById(postId).map(p -> {
            comment.setPost(p);
            postCommentRepo.save(comment);
            return comment;
        }).orElse(comment);
    }

    public PostOne newPost(PostOne post){
        return postOneRepo.save(post);
    }
}
