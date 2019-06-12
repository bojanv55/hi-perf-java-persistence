package me.vukas.hiperfjavapersistence.entity.relationship.onetomany;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.io.Serializable;

@Value
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class CompositeId implements Serializable {
    private final Long id1;
    private final Long id2;
}
