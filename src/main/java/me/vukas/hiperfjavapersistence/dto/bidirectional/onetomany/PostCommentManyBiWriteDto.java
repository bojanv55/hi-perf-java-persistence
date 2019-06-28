package me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany;

import lombok.Data;

@Data
public class PostCommentManyBiWriteDto {
  private Long postId;
  private String content;
  private String updateThis;
  private String dontUpdateThis;
}
