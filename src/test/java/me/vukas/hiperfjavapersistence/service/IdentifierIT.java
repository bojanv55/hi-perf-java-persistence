package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.identifier.uuid.AssignedUUIDGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.uuid.UUIDGenerator;
import org.hibernate.id.IdentifierGenerationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IdentifierIT {

    @Autowired
    private IdentifierService identifierService;

    @Test
    public void assignedUUIDGeneratorMustBeAssignedBeforeSave(){
        AssignedUUIDGenerator generator = new AssignedUUIDGenerator();

        assertThatThrownBy(() -> identifierService.saveAssignedUUIDGenerator(generator))
                .hasCauseInstanceOf(IdentifierGenerationException.class);
    }

    @Test
    public void assignedUUIDGeneratorShouldBePersistedToDb(){
        AssignedUUIDGenerator generator = new AssignedUUIDGenerator();
        UUID uuid = UUID.fromString("123e4567-e89b-42d3-a456-556642440000");
        generator.setId(uuid);
        identifierService.saveAssignedUUIDGenerator(generator);
        Optional<AssignedUUIDGenerator> optGenerator = identifierService.getAssignedUUIDGenerator(uuid);

        assertThat(optGenerator).isPresent();
    }

    @Test
    public void uUIDGeneratorNeedNotToBeAssignedBeforeSave(){
        UUIDGenerator generator = new UUIDGenerator();

        UUIDGenerator savedGen = identifierService.saveUUIDGenerator(generator);

        assertThat(savedGen.getId().toString()).isNotEmpty();
    }

}
