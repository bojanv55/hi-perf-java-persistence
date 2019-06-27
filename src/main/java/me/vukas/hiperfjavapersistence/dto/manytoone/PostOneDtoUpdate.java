package me.vukas.hiperfjavapersistence.dto.manytoone;

import lombok.Data;

@Data
public class PostOneDtoUpdate {
  private Long id;
  private String content;

  public PostOneDtoUpdate(Long id, String content) {
    this.id = id;
    this.content = content;
  }
}
