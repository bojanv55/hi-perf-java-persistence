package me.vukas.hiperfjavapersistence.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiDto;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.SomeEnum;
import me.vukas.hiperfjavapersistence.mapper.bidirectional.onetomany.PostOneBiMapper;
import me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.onetomany.PostOneBiRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OneToManyBiService {
    private PostOneBiRepository postOneRepo;
    private PostOneBiMapper mapper;

    public OneToManyBiService(
        PostOneBiRepository postOneRepo,
        PostOneBiMapper mapper) {
        this.postOneRepo = postOneRepo;
        this.mapper = mapper;
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
    public List<PostOneBiDto> findByEnum(SomeEnum someEnum){
        List<PostOneBi> loaded = postOneRepo
            .loadByEnumeration(someEnum);
        return loaded.stream()
            .map(p -> mapper.map(p))
            .collect(Collectors.toList());
    }
}
