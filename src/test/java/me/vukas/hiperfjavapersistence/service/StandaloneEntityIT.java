package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.StandaloneEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StandaloneEntityIT {

    @Autowired
    private StandaloneEntityService standaloneEntityService;

    @Test
    public void standaloneEntityOnSaveShouldBePersistedToDb(){
        StandaloneEntity standaloneEntity = new StandaloneEntity(1, "Test");

        assertThat(standaloneEntityService.getStandaloneEntity(1)).isEmpty();

        standaloneEntityService.saveStandaloneEntity(standaloneEntity);

        Optional<StandaloneEntity> optSavedStandaloneEntity = standaloneEntityService.getStandaloneEntity(1);

        assertThat(optSavedStandaloneEntity).isPresent();

        StandaloneEntity savedStandaloneEntity = optSavedStandaloneEntity.get();
        assertThat(savedStandaloneEntity.getId()).isEqualTo(1);
        assertThat(savedStandaloneEntity.getName()).isEqualTo("Test");
    }

}
