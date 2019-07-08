package me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany;

import lombok.Data;

@Data
public class PostOneBiNoCommentsReadDto {
  private Long id;
  private SomeEnumDto enumeration;
  private String updateThis;
  private String dontUpdateThis;
}
