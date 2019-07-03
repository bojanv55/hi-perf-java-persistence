package me.vukas.hiperfjavapersistence.dto;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PageRequestDto {
  private final Integer pageNumber;
  private final Integer pageSize;
  private final SortDto sort;
}
