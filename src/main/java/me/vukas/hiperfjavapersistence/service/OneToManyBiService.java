package me.vukas.hiperfjavapersistence.service;

import com.querydsl.core.types.Predicate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.NoResultException;
import me.vukas.hiperfjavapersistence.dto.PageDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostCommentManyBiReadDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostCommentManyBiUpdateDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostCommentManyBiWriteDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiNoCommentsReadDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiReadDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiWriteDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.SomeEnumDto;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostCommentManyBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi_;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.SomeEnum;
import me.vukas.hiperfjavapersistence.mapper.PageMapper;
import me.vukas.hiperfjavapersistence.mapper.bidirectional.onetomany.PostCommentManyBiMapper;
import me.vukas.hiperfjavapersistence.mapper.bidirectional.onetomany.PostOneBiMapper;
import me.vukas.hiperfjavapersistence.repository.jpa.relationship.bidirectional.onetomany.PostCommentManyBiRepository;
import me.vukas.hiperfjavapersistence.repository.jpa.relationship.bidirectional.onetomany.PostOneBiRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OneToManyBiService {
    private PostOneBiRepository postOneRepo;
    private PostCommentManyBiRepository commentManyRepo;
    private PostOneBiMapper mapper;
    private PageMapper pageMapper;
    private PostCommentManyBiMapper commentMapper;

    public OneToManyBiService(
        PostOneBiRepository postOneRepo,
        PostCommentManyBiRepository commentManyRepo,
        PostOneBiMapper mapper,
        PageMapper pageMapper,
        PostCommentManyBiMapper commentMapper) {
        this.postOneRepo = postOneRepo;
        this.commentManyRepo = commentManyRepo;
        this.mapper = mapper;
        this.commentMapper = commentMapper;
        this.pageMapper = pageMapper;
    }

    public PostOneBi addNewPost(PostOneBi post){
        return postOneRepo.save(post);
    }

    public PostOneBi changePost(PostOneBi post){
        return postOneRepo.save(post);
    }

    @Transactional(readOnly = true)
    public Optional<PostOneBi> getPostById(Long postId){
        return postOneRepo.loadPostsByIdEagerlyWithSort(postId);
    }

    @Transactional(readOnly = true)
    public List<PostOneBiReadDto> findByEnum(SomeEnum someEnum){
        List<PostOneBi> loaded = postOneRepo
            .loadByEnumeration(someEnum);
        return loaded.stream()
            .map(p -> mapper.map(p))
            .collect(Collectors.toList());
    }

    public PostOneBiReadDto writePost(PostOneBiWriteDto writeDto) {
        return mapper.map(
            postOneRepo.save(
                mapper.map(writeDto)
            )
        );
    }

    public PostCommentManyBiReadDto writeCommentToPost(PostCommentManyBiWriteDto writeComment1) {
        return postOneRepo.findById(writeComment1.getPostId()).map(p -> {
            PostCommentManyBi commentManyBi = commentMapper.map(writeComment1);
            commentManyBi.setPost(p);
            return commentMapper.map(commentManyRepo.save(commentManyBi));
        }).orElseThrow(() -> new NoResultException("Cannot find post to add comment to"));
    }

    public PostCommentManyBiReadDto updateComment(PostCommentManyBiUpdateDto updateCommentDto2) {
        return commentManyRepo.findById(updateCommentDto2.getId()).map(c -> {
            commentMapper.mapInPlace(updateCommentDto2, c);
            return commentMapper.map(commentManyRepo.save(c));
        }).orElseThrow(() -> new NoResultException("Cannot find comment for update"));
    }

    public PostOneBiReadDto removeComment(Long postId, Long commentId) {
        return postOneRepo.findById(postId).map(p -> {
            PostCommentManyBi c = commentManyRepo.findById(commentId)
                .orElseThrow(() -> new NoResultException("Cannot find comment for removal from post"));
            p.removeComment(c);
            return mapper.map(postOneRepo.save(p));
        }).orElseThrow(() -> new NoResultException("Cannot find post to remove comment from"));
    }

    public PageDto<PostOneBiReadDto> getPage(SomeEnum someEnum, int page, int size){
        Page<PostOneBiReadDto> postPage = postOneRepo
            .findAllByEnumeration(
                someEnum,
                PageRequest.of(page, size, Sort.by(PostOneBi_.ID).descending().and(Sort.by(PostOneBi_.DONT_UPDATE_THIS)))
                //PageRequest.of(page, size, Sort.by(PostOneBi_.DONT_UPDATE_THIS).descending())
                //PageRequest.of(page, size)
            )
            .map(mapper::map);
        return pageMapper.map(postPage);
    }

    @Transactional
    public void deleteAllInBulk(SomeEnum enumeration){
        postOneRepo.deleteAllInBulk(enumeration);
    }

    @Transactional
    public void deleteAll(SomeEnum enumeration){
        postOneRepo.deleteAllByEnumeration(enumeration);
    }

    public PageDto<PostOneBiNoCommentsReadDto> getByPredicate(Predicate predicate, Pageable pageable){
        Page<PostOneBiNoCommentsReadDto> postPage = postOneRepo
            .findAll(predicate, pageable)
            .map(mapper::mapNoComments);
        return pageMapper.map(postPage);
    }

    public void insertPostsOneBi(){
        //write comments
        for(int i=1; i<=50; i++){
            PostOneBiWriteDto writeDto = new PostOneBiWriteDto();
            writeDto.setEnumeration(SomeEnumDto.THREE);
            writeDto.setUpdateThis("writeUpdateThis" + i);
            writeDto.setDontUpdateThis("writeDontUpdateThis" + i);
            PostOneBiReadDto readDto = writePost(writeDto);
            for(int j=1; j<=2; j++){
                PostCommentManyBiWriteDto writeComment = new PostCommentManyBiWriteDto();
                writeComment.setContent("writeCom" + i + ":" + j);
                writeComment.setUpdateThis("writeComUpdate" + i + ":" + j);
                writeComment.setDontUpdateThis("writeComDontUpdate" + i + ":" + j);
                writeComment.setPostId(readDto.getId());
                writeCommentToPost(writeComment);
            }
        }
    }
}
