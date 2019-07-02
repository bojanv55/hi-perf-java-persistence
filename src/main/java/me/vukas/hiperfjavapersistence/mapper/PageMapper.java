package me.vukas.hiperfjavapersistence.mapper;

import me.vukas.hiperfjavapersistence.dto.PageDto;
import me.vukas.hiperfjavapersistence.dto.PageRequestDto;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Mapper
public interface PageMapper {
  default <T> PageDto<T> map(Page<T> page){
    return new PageDto<>(page.getTotalElements(), page.getContent(), map(page.getPageable()));
  }

  default PageRequestDto map(Pageable pageRequest){
    return new PageRequestDto(pageRequest.getPageNumber(), pageRequest.getPageSize());
  }
}
