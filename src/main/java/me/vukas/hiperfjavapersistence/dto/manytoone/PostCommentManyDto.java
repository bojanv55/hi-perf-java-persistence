package me.vukas.hiperfjavapersistence.dto.manytoone;

import lombok.Data;

@Data
public class PostCommentManyDto {
  private Long id;
  private String comment;

  public PostCommentManyDto(String comment){
    this.id = null;
    this.comment = comment;
  }
}
