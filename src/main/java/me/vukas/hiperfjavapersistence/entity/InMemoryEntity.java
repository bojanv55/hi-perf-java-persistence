package me.vukas.hiperfjavapersistence.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.keyvalue.annotation.KeySpace;

@Data
@KeySpace
public class InMemoryEntity {
  @Id
  private final Long id;
  private final String name;
}
