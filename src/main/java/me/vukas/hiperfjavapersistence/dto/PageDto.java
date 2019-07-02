package me.vukas.hiperfjavapersistence.dto;

import java.util.List;
import lombok.Value;

@Value
public class PageDto<T> {
  private final Long total;
  private final List<T> content;
  private final PageRequestDto pageable;
}
