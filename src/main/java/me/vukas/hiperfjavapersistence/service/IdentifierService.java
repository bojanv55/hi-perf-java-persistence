package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.entity.identifier.numerical.IdentityGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.numerical.PooledSequenceGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.numerical.SequenceGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.numerical.TableGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.uuid.AssignedUUIDGenerator;
import me.vukas.hiperfjavapersistence.entity.identifier.uuid.UUIDGenerator;
import me.vukas.hiperfjavapersistence.repository.identifier.numerical.IdentityGeneratorRepository;
import me.vukas.hiperfjavapersistence.repository.identifier.numerical.PooledSequenceGeneratorRepository;
import me.vukas.hiperfjavapersistence.repository.identifier.numerical.SequenceGeneratorRepository;
import me.vukas.hiperfjavapersistence.repository.identifier.numerical.TableGeneratorRepository;
import me.vukas.hiperfjavapersistence.repository.identifier.uuid.AssignedUUIDGeneratorRepository;
import me.vukas.hiperfjavapersistence.repository.identifier.uuid.UUIDGeneratorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class IdentifierService {

    private AssignedUUIDGeneratorRepository assignedUUIDGeneratorRepository;
    private UUIDGeneratorRepository uuidGeneratorRepository;
    private IdentityGeneratorRepository identityGeneratorRepository;
    private SequenceGeneratorRepository sequenceGeneratorRepository;
    private TableGeneratorRepository tableGeneratorRepository;
    private PooledSequenceGeneratorRepository pooledSequenceGeneratorRepository;

    public IdentifierService(AssignedUUIDGeneratorRepository assignedUUIDGeneratorRepository,
                             UUIDGeneratorRepository uuidGeneratorRepository,
                             IdentityGeneratorRepository identityGeneratorRepository,
                             SequenceGeneratorRepository sequenceGeneratorRepository,
                             TableGeneratorRepository tableGeneratorRepository,
                             PooledSequenceGeneratorRepository pooledSequenceGeneratorRepository
    ) {
        this.assignedUUIDGeneratorRepository = assignedUUIDGeneratorRepository;
        this.uuidGeneratorRepository = uuidGeneratorRepository;
        this.identityGeneratorRepository = identityGeneratorRepository;
        this.sequenceGeneratorRepository = sequenceGeneratorRepository;
        this.tableGeneratorRepository = tableGeneratorRepository;
        this.pooledSequenceGeneratorRepository = pooledSequenceGeneratorRepository;
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

    public List<TableGenerator> saveAllTableGenerators(Iterable<TableGenerator> tgs){
        return tableGeneratorRepository.saveAll(tgs);
    }

    public List<PooledSequenceGenerator> saveAllPooledSequencesGenerators(Iterable<PooledSequenceGenerator> sequences){
        return pooledSequenceGeneratorRepository.saveAll(sequences);
    }
}
