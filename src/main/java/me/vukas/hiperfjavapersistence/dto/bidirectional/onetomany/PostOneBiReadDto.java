package me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public class PostOneBiReadDto {
  private Long id;
  private SomeEnumDto enumeration;
  private String updateThis;
  private String dontUpdateThis;
  private Set<PostCommentManyBiReadDto> comments = new HashSet<>();
}
