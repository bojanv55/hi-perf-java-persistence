package me.vukas.hiperfjavapersistence.mapper.manytoone;

import me.vukas.hiperfjavapersistence.dto.manytoone.PostOneDtoWrite;
import me.vukas.hiperfjavapersistence.entity.relationship.manytoone.PostOne;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostOneDtoMapper {
  PostOne map(PostOneDtoWrite dto);
  //can also be projected, but better to project directly from JPA repo
  //PostOneDtoRead map(PostOne post);
}
