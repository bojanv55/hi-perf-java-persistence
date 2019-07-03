package me.vukas.hiperfjavapersistence.dto;

import java.util.List;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class SortDto {
  private final List<OrderDto> orders;

  @Builder
  @Value
  public static class OrderDto{
    private final String property;
    private final DirectionDto direction;
    private final boolean ignoreCase;
  }

  public enum DirectionDto{
    ASC,
    DESC
  }
}
