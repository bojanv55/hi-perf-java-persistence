package me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public class PostOneBiDto {
  private Long id;
  private SomeEnumDto enumeration;
  private Set<PostCommentManyBiDto> comments = new HashSet<>();
}
