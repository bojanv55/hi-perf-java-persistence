package me.vukas.hiperfjavapersistence.dto.manytoone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostOneDtoRead {
  private Long id;
  private String content;
  private OtherAttribsDto otherAttribs;
}
