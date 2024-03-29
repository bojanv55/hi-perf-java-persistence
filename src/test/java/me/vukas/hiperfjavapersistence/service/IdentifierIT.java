package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.identifier.numerical.IdentityGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.numerical.PooledSequenceGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.numerical.SequenceGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.numerical.TableGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.uuid.AssignedUUIDGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.uuid.UUIDGenerator;
import org.hibernate.id.IdentifierGenerationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
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

    @Test
    public void savingAllIdentityGeneratorsCannotBeBatched(){
        IdentityGenerator generator1 = new IdentityGenerator();
        IdentityGenerator generator2 = new IdentityGenerator();
        IdentityGenerator generator3 = new IdentityGenerator();

        List<IdentityGenerator> generatorList =
        identifierService.saveAllIdentityGenerators(
                Arrays.asList(generator1, generator2, generator3));

        assertThat(generatorList).hasSize(3);
    }

    @Test
    public void savingAllSequenceGeneratorsCanBeBatched(){
        SequenceGenerator sg1 = new SequenceGenerator();
        SequenceGenerator sg2 = new SequenceGenerator();
        SequenceGenerator sg3 = new SequenceGenerator();

        List<SequenceGenerator> generatorList =
                identifierService.saveAllSequencesGenerators(
                        Arrays.asList(sg1, sg2, sg3));

        assertThat(generatorList).hasSize(3);
    }

    @Test
    public void savingAllTableGeneratorsCanBeBatched(){
        TableGenerator tg1 = new TableGenerator();
        TableGenerator tg2 = new TableGenerator();
        TableGenerator tg3 = new TableGenerator();

        List<TableGenerator> generatorList =
                identifierService.saveAllTableGenerators(
                        Arrays.asList(tg1, tg2, tg3));

        assertThat(generatorList).hasSize(3);
    }

    @Test
    public void savingAllPooledSequenceGeneratorsCanBeBatched(){
        PooledSequenceGenerator psg1 = new PooledSequenceGenerator();
        PooledSequenceGenerator psg2 = new PooledSequenceGenerator();
        PooledSequenceGenerator psg3 = new PooledSequenceGenerator();
        PooledSequenceGenerator psg4 = new PooledSequenceGenerator();
        PooledSequenceGenerator psg5 = new PooledSequenceGenerator();
        PooledSequenceGenerator psg6 = new PooledSequenceGenerator();
        PooledSequenceGenerator psg7 = new PooledSequenceGenerator();
        PooledSequenceGenerator psg8 = new PooledSequenceGenerator();

        List<PooledSequenceGenerator> generatorList =
                identifierService.saveAllPooledSequencesGenerators(
                        Arrays.asList(psg1, psg2, psg3, psg4, psg5, psg6, psg7, psg8));

        assertThat(generatorList).hasSize(8);
    }

}
