package me.vukas.hiperfjavapersistence.entity.relationship.onetomany;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.persistence.Embeddable;

@Value
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Embeddable //not necessary, but to be consistent with @ElementCollection where it has to be @Embeddable
public class CombinationOfAttribs {
  private final String attrib1;
  private final Integer attrib2;
  private final Float attrib3;
}
