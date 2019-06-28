package me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany;

import lombok.Data;

@Data
public class PostOneBiUpdateDto {
  private Long id;
  private SomeEnumDto enumeration;
  private String updateThis;
}
