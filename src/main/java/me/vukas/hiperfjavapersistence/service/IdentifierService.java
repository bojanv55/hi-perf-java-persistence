package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.identifier.uuid.AssignedUUIDGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.uuid.UUIDGenerator;
import me.vukas.hiperfjavapersistence.repository.AssignedUUIDGeneratorRepository;
import me.vukas.hiperfjavapersistence.repository.UUIDGeneratorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class IdentifierService {

    private AssignedUUIDGeneratorRepository assignedUUIDGeneratorRepository;
    private UUIDGeneratorRepository uuidGeneratorRepository;

    public IdentifierService(AssignedUUIDGeneratorRepository assignedUUIDGeneratorRepository,
                             UUIDGeneratorRepository uuidGeneratorRepository) {
        this.assignedUUIDGeneratorRepository = assignedUUIDGeneratorRepository;
        this.uuidGeneratorRepository = uuidGeneratorRepository;
    }

    public void saveAssignedUUIDGenerator(AssignedUUIDGenerator generator){
        assignedUUIDGeneratorRepository.save(generator);
    }

    public Optional<AssignedUUIDGenerator> getAssignedUUIDGenerator(UUID id){
        return assignedUUIDGeneratorRepository.findById(id);
    }

    public UUIDGenerator saveUUIDGenerator(UUIDGenerator generator){
        return uuidGeneratorRepository.save(generator);
    }
}
