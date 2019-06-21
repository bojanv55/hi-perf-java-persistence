package me.vukas.hiperfjavapersistence.entity.relationship.manytoone;

import javax.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Embeddable
public class OtherAttribs {
  private final Integer one;
  private final String two;
  private final Long three;
  private final Double four;
}
