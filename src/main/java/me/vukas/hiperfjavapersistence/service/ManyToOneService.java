package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostCommentMany;
import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostOne;
import me.vukas.hiperfjavapersistence.repository.PostCommentManyRepository;
import me.vukas.hiperfjavapersistence.repository.PostOneRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.text.MessageFormat;

@Service
public class ManyToOneService {
    private PostOneRepository postOneRepo;
    private PostCommentManyRepository postCommentRepo;

    public ManyToOneService(PostOneRepository postOneRepo, PostCommentManyRepository postCommentRepo) {
        this.postOneRepo = postOneRepo;
        this.postCommentRepo = postCommentRepo;
    }

    @Transactional
    public PostCommentMany addNewCommentForPost(PostCommentMany comment, Long postId){
        return postOneRepo.findById(postId).map(p -> {
            comment.commentToPost(p);
            postCommentRepo.save(comment);
            return comment;
        }).orElseThrow(() -> new EntityNotFoundException(
                MessageFormat.format("PostOne with id {0} is not found.", postId)));
    }

    public PostOne newPost(PostOne post){
        return postOneRepo.save(post);
    }
}
