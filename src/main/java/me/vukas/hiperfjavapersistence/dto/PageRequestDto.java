package me.vukas.hiperfjavapersistence.dto;

import lombok.Value;

@Value
public class PageRequestDto {
  private final Integer page;
  private final Integer size;
  private final SortDto sort;
}
