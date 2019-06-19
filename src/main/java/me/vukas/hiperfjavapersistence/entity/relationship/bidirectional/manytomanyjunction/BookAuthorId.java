package me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable //not necessary, but to be consistent with @ElementCollection where it has to be @Embeddable
public class BookAuthorId implements Serializable {
  private Long bookId;
  private Long authorId;
}
