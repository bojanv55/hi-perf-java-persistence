package me.vukas.hiperfjavapersistence.service;

import java.util.Optional;
import me.vukas.hiperfjavapersistence.entity.StandaloneEntity;
import me.vukas.hiperfjavapersistence.repository.jpa.StandaloneEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class StandaloneEntityService {

    private StandaloneEntityRepository standaloneEntityRepository;

    public StandaloneEntityService(StandaloneEntityRepository standaloneEntityRepository) {
        this.standaloneEntityRepository = standaloneEntityRepository;
    }

    public void saveStandaloneEntity(StandaloneEntity entity){
        standaloneEntityRepository.save(entity);
    }

    public Optional<StandaloneEntity> getStandaloneEntity(Integer id){
        return standaloneEntityRepository.findById(id);
    }

}
