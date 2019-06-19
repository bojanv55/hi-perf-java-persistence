package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Embeddable //not necessary, but to be consistent with @ElementCollection where it has to be @Embeddable
public class BookAuthorId implements Serializable {
  private final Long bookId;
  private final Long authorId;
}
