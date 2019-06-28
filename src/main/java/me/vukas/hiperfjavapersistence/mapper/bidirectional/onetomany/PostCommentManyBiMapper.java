package me.vukas.hiperfjavapersistence.mapper.bidirectional.onetomany;

import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostCommentManyBiReadDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostCommentManyBiUpdateDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostCommentManyBiWriteDto;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostCommentManyBi;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface PostCommentManyBiMapper {
  PostCommentManyBiReadDto map(PostCommentManyBi comment);
  PostCommentManyBi map(PostCommentManyBiWriteDto writeDto);
  void mapInPlace(PostCommentManyBiUpdateDto updateDto, @MappingTarget PostCommentManyBi post);
}
