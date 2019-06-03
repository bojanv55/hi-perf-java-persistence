package me.vukas.hiperfjavapersistence.service;

import lombok.AllArgsConstructor;
import me.vukas.hiperfjavapersistence.entity.StandaloneEntity;
import me.vukas.hiperfjavapersistence.repository.StandaloneEntityRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StandaloneEntityService {

    private StandaloneEntityRepository standaloneEntityRepository;

    public void saveStandaloneEntity(StandaloneEntity entity){
        standaloneEntityRepository.save(entity);
    }

    public Optional<StandaloneEntity> getStandaloneEntity(Integer id){
        return standaloneEntityRepository.findById(id);
    }

}
