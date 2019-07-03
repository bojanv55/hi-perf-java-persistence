package me.vukas.hiperfjavapersistence.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import me.vukas.hiperfjavapersistence.entity.InMemoryEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InMemoryEntityIT {

  @Autowired
  private InMemoryEntityService inMemoryEntityService;

  @Test
  public void inMemoryTest(){
    InMemoryEntity e1 = new InMemoryEntity(1L, "One");
    InMemoryEntity e2 = new InMemoryEntity(2L, "One");
    InMemoryEntity e3 = new InMemoryEntity(3L, "Two");
    InMemoryEntity e4 = new InMemoryEntity(4L, "Two");
    InMemoryEntity e5 = new InMemoryEntity(5L, "Two");

    inMemoryEntityService.save(e1);
    inMemoryEntityService.save(e2);
    inMemoryEntityService.save(e3);
    inMemoryEntityService.save(e4);
    inMemoryEntityService.save(e5);

    List<InMemoryEntity> entities = inMemoryEntityService.getAll("Two");

    assertThat(entities).hasSize(3);
  }
}
