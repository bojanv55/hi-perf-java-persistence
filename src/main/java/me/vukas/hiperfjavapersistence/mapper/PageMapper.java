package me.vukas.hiperfjavapersistence.mapper;

import java.util.List;
import java.util.stream.Collectors;
import me.vukas.hiperfjavapersistence.dto.PageDto;
import me.vukas.hiperfjavapersistence.dto.PageRequestDto;
import me.vukas.hiperfjavapersistence.dto.SortDto;
import me.vukas.hiperfjavapersistence.dto.SortDto.DirectionDto;
import me.vukas.hiperfjavapersistence.dto.SortDto.OrderDto;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

@Mapper
public interface PageMapper {
  default <T> PageDto<T> map(Page<T> page){
    return new PageDto<>(page.getTotalElements(), page.getContent(), map(page.getPageable()));
  }

  default PageRequestDto map(Pageable pageRequest){
    return new PageRequestDto(pageRequest.getPageNumber(), pageRequest.getPageSize(), map(pageRequest.getSort()));
  }

  default SortDto map(Sort sort){
    return sort == null ? null : new SortDto(map(sort.get().collect(Collectors.toList())));
  }

  List<OrderDto> map(List<Order> orders);

  default OrderDto map(Order order){
    return new OrderDto(
        order.getProperty(),
        order.getDirection() == Direction.ASC ? DirectionDto.ASC : DirectionDto.DESC,
        order.isIgnoreCase()
    );
  }
}
