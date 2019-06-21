package me.vukas.hiperfjavapersistence.entity.relationship.manytoone;

import java.time.Instant;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class PostOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private OtherAttribs otherAttribs;

    public void doSomeBusinessLogic() {
        otherAttribs = new OtherAttribs(Instant.now().getNano(), "two", 3L, 4.0);
    }
}
