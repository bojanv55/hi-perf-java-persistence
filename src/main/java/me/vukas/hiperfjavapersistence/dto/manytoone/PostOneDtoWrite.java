package me.vukas.hiperfjavapersistence.dto.manytoone;

import lombok.Data;

@Data
public class PostOneDtoWrite {
  private String content;
  private String dontUpdate;

  public PostOneDtoWrite(String content, String dontUpdate){
    this.content = content;
    this.dontUpdate = dontUpdate;
  }
}
