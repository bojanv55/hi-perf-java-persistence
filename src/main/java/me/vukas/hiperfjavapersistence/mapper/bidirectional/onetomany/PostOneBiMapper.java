package me.vukas.hiperfjavapersistence.mapper.bidirectional.onetomany;

import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiReadDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiUpdateDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiWriteDto;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface PostOneBiMapper {
  PostOneBiReadDto map(PostOneBi post);
  PostOneBi map(PostOneBiWriteDto writeDto);
  void mapInPlace(PostOneBiUpdateDto updateDto, @MappingTarget PostOneBi post);
}
