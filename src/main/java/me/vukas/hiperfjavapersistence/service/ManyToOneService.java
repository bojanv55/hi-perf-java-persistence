package me.vukas.hiperfjavapersistence.service;

import java.text.MessageFormat;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import me.vukas.hiperfjavapersistence.dto.manytoone.PostOneDtoRead;
import me.vukas.hiperfjavapersistence.dto.manytoone.PostOneDtoUpdate;
import me.vukas.hiperfjavapersistence.dto.manytoone.PostOneDtoWrite;
import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostCommentMany;
import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostOne;
import me.vukas.hiperfjavapersistence.mapper.manytoone.PostOneDtoMapper;
import me.vukas.hiperfjavapersistence.repository.jpa.relationship.manytoone.PostCommentManyRepository;
import me.vukas.hiperfjavapersistence.repository.jpa.relationship.manytoone.PostOneRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ManyToOneService {
    private PostOneRepository postOneRepo;
    private PostCommentManyRepository postCommentRepo;

    private PostOneDtoMapper postOneDtoMapper;

    public ManyToOneService(
        PostOneRepository postOneRepo,
        PostCommentManyRepository postCommentRepo,
        PostOneDtoMapper postOneDtoMapper) {
        this.postOneRepo = postOneRepo;
        this.postCommentRepo = postCommentRepo;
        this.postOneDtoMapper = postOneDtoMapper;
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

    public PostOne addNewPost(PostOne post){
        return postOneRepo.save(post);
    }

    @Transactional(readOnly = true)
    public Optional<PostCommentMany> getCommentById(Long id){
        return postCommentRepo.findById(id);
    }

    @Transactional
    public void newPostFromDto(PostOneDtoWrite postDto){
        PostOne post = postOneDtoMapper.map(postDto);
        post.doSomeBusinessLogic();
        postOneRepo.save(post);
    }

    @Transactional(readOnly = true)
    public Optional<PostOneDtoRead> getPostToDto(Long postId){
        return postOneRepo.findById(postId).map(p -> postOneDtoMapper.map(p));
    }

    @Transactional
    public void updatePost(PostOneDtoUpdate postDto) {
        postOneRepo.findById(postDto.getId()).ifPresent(p -> {
            postOneDtoMapper.mapInPlace(postDto, p);
            postOneRepo.save(p);
        });
    }
}
