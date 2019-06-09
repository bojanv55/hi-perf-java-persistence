package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.identifier.numerical.IdentityGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.numerical.SequenceGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.uuid.AssignedUUIDGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.uuid.UUIDGenerator;
import me.vukas.hiperfjavapersistence.repository.AssignedUUIDGeneratorRepository;
import me.vukas.hiperfjavapersistence.repository.IdentityGeneratorRepository;
import me.vukas.hiperfjavapersistence.repository.SequenceGeneratorRepository;
import me.vukas.hiperfjavapersistence.repository.UUIDGeneratorRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class IdentifierService {

    private AssignedUUIDGeneratorRepository assignedUUIDGeneratorRepository;
    private UUIDGeneratorRepository uuidGeneratorRepository;
    private IdentityGeneratorRepository identityGeneratorRepository;
    private SequenceGeneratorRepository sequenceGeneratorRepository;

    public IdentifierService(AssignedUUIDGeneratorRepository assignedUUIDGeneratorRepository,
                             UUIDGeneratorRepository uuidGeneratorRepository,
                             IdentityGeneratorRepository identityGeneratorRepository,
                             SequenceGeneratorRepository sequenceGeneratorRepository
    ) {
        this.assignedUUIDGeneratorRepository = assignedUUIDGeneratorRepository;
        this.uuidGeneratorRepository = uuidGeneratorRepository;
        this.identityGeneratorRepository = identityGeneratorRepository;
        this.sequenceGeneratorRepository = sequenceGeneratorRepository;
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

    public List<IdentityGenerator> saveAllIdentityGenerators(Iterable<IdentityGenerator> identities){
        return identityGeneratorRepository.saveAll(identities);
    }

    public List<SequenceGenerator> saveAllSequencesGenerators(Iterable<SequenceGenerator> sequences){
        return sequenceGeneratorRepository.saveAll(sequences);
    }
}
