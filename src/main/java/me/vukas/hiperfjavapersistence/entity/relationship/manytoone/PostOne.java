package me.vukas.hiperfjavapersistence.entity.relationship.manytoone;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
//@DynamicUpdate //update only changed properties. cannot reuse existing execution plans.
public class PostOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private String dontUpdate;

    private OtherAttribs otherAttribs;

    public void doSomeBusinessLogic() {
        otherAttribs = new OtherAttribs(Instant.now().getNano(), "two", 3L, 4.0);
    }
}
