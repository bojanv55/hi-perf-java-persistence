package me.vukas.hiperfjavapersistence.service;

import java.util.List;
import me.vukas.hiperfjavapersistence.entity.InMemoryEntity;
import me.vukas.hiperfjavapersistence.repository.map.InMemoryEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class InMemoryEntityService {

  private InMemoryEntityRepository inMemoryEntityRepository;

  public InMemoryEntityService(
      InMemoryEntityRepository inMemoryEntityRepository) {
    this.inMemoryEntityRepository = inMemoryEntityRepository;
  }

  public void save(InMemoryEntity entity){
    inMemoryEntityRepository.save(entity);
  }

  public List<InMemoryEntity> getAll(String name){
    return inMemoryEntityRepository.findByName(name);
  }
}
