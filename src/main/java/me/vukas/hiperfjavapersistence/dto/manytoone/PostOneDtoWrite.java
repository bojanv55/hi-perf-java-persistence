package me.vukas.hiperfjavapersistence.dto.manytoone;

import lombok.Data;

@Data
public class PostOneDtoWrite {
  private Long id;
  private String content;

  public PostOneDtoWrite(String content){
    this.id = null;
    this.content = content;
  }
}
