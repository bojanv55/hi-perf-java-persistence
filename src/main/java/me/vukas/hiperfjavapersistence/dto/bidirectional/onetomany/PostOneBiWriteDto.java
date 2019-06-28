package me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany;

import lombok.Data;

@Data
public class PostOneBiWriteDto {
  private SomeEnumDto enumeration;
  private String updateThis;
  private String dontUpdateThis;
}
