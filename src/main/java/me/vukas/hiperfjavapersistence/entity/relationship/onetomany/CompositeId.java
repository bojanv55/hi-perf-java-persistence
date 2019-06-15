package me.vukas.hiperfjavapersistence.entity.relationship.onetomany;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Value
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Embeddable //not necessary, but to be consistent with @ElementCollection where it has to be @Embeddable
public class CompositeId implements Serializable {
    private final Long id1;
    private final Long id2;
}
