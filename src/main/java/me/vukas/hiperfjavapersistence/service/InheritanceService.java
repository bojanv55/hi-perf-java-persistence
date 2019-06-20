package me.vukas.hiperfjavapersistence.service;

import java.util.Optional;
import javax.transaction.Transactional;
import me.vukas.hiperfjavapersistence.entity.inheritance.jointable.ParentJt;
import me.vukas.hiperfjavapersistence.entity.inheritance.singletable.ParentSt;
import me.vukas.hiperfjavapersistence.entity.inheritance.tableperclass.ParentTPC;
import me.vukas.hiperfjavapersistence.repository.inheritance.jointable.ParentJtRepository;
import me.vukas.hiperfjavapersistence.repository.inheritance.singletable.ParentStRepository;
import me.vukas.hiperfjavapersistence.repository.inheritance.tableperclass.ParentTPCRepository;
import org.springframework.stereotype.Service;

@Service
public class InheritanceService {

  private ParentStRepository parentStRepository;
  private ParentJtRepository parentJtRepository;
  private ParentTPCRepository parentTPCRepository;

  public InheritanceService(
      ParentStRepository parentStRepository,
      ParentJtRepository parentJtRepository,
      ParentTPCRepository parentTPCRepository) {
    this.parentStRepository = parentStRepository;
    this.parentJtRepository = parentJtRepository;
    this.parentTPCRepository = parentTPCRepository;
  }

  @Transactional
  public ParentSt saveParentSt(ParentSt parentSt){
    return parentStRepository.save(parentSt);
  }

  @Transactional
  public ParentJt saveParentJt(ParentJt parentJt){
    return parentJtRepository.save(parentJt);
  }

  @Transactional
  public ParentTPC saveParentTPC(ParentTPC parentTPC){
    return parentTPCRepository.save(parentTPC);
  }

  public Optional<ParentJt> getParentJt(Long id) {
    return parentJtRepository.findById(id);
  }

  public Optional<ParentSt> getParentSt(Long id) {
    return parentStRepository.findById(id);
  }

  public Optional<ParentTPC> getParentTPC(Long id) {
    return parentTPCRepository.findById(id);
  }
}
