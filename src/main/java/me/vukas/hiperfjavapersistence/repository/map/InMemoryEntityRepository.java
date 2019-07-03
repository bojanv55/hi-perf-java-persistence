package me.vukas.hiperfjavapersistence.repository.map;

import java.util.List;
import me.vukas.hiperfjavapersistence.entity.InMemoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InMemoryEntityRepository extends CrudRepository<InMemoryEntity, Long> {
  List<InMemoryEntity> findByName(String name);
}
