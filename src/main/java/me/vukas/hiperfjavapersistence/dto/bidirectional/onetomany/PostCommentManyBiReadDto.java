package me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany;

import lombok.Data;

@Data
public class PostCommentManyBiReadDto {
  private Long id;
  private String content;
  private String updateThis;
  private String dontUpdateThis;
}
