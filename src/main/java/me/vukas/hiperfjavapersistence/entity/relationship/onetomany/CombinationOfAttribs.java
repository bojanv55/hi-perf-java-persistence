package me.vukas.hiperfjavapersistence.entity.relationship.onetomany;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class CombinationOfAttribs {
  private String attrib1;
  private Integer attrib2;
  private Float attrib3;
}
