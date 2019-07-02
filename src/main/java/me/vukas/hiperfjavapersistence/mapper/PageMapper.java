package me.vukas.hiperfjavapersistence.mapper;

import me.vukas.hiperfjavapersistence.dto.PageDto;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

@Mapper
public interface PageMapper {
  default <T> PageDto<T> map(Page<T> page){
    PageDto<T> pageDto = new PageDto<>(page.getTotalPages(), page.getContent(), null);
    return pageDto;
  }
}
