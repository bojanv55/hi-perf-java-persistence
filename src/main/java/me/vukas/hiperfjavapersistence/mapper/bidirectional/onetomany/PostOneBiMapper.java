package me.vukas.hiperfjavapersistence.mapper.bidirectional.onetomany;

import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiDto;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import org.mapstruct.Mapper;

@Mapper
public interface PostOneBiMapper {
  PostOneBiDto map(PostOneBi post);
}
