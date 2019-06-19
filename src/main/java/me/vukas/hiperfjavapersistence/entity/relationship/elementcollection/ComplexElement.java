package me.vukas.hiperfjavapersistence.entity.relationship.elementcollection;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.persistence.Embeddable;

@Value
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Embeddable //must be embeddable since it is used inside @ElementCollection as value object
public class ComplexElement {
    private final String attrib1;
    private final Integer attrib2;
    private final Float attrib3;
}
