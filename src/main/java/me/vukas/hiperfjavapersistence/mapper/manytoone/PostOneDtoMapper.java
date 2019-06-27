package me.vukas.hiperfjavapersistence.mapper.manytoone;

import me.vukas.hiperfjavapersistence.dto.manytoone.PostOneDtoRead;
import me.vukas.hiperfjavapersistence.dto.manytoone.PostOneDtoUpdate;
import me.vukas.hiperfjavapersistence.dto.manytoone.PostOneDtoWrite;
import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostOne;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface PostOneDtoMapper {
  PostOne map(PostOneDtoWrite dto);
  PostOneDtoRead map(PostOne post);

  void mapInPlace(PostOneDtoUpdate postDto, @MappingTarget PostOne p);
}
