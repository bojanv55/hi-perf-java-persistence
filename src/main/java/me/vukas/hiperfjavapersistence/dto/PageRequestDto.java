package me.vukas.hiperfjavapersistence.dto;

import lombok.Value;

@Value
public class PageRequestDto {
  private final int page;
  private final int size;
}
