package me.vukas.hiperfjavapersistence.service;

import java.util.Optional;
import me.vukas.hiperfjavapersistence.entity.inheritance.jointable.ParentJt;
import me.vukas.hiperfjavapersistence.entity.inheritance.mappedsuperclass.Child2Ms;
import me.vukas.hiperfjavapersistence.entity.inheritance.mappedsuperclass.ParentMs;
import me.vukas.hiperfjavapersistence.entity.inheritance.singletable.ParentSt;
import me.vukas.hiperfjavapersistence.entity.inheritance.tableperclass.ParentTPC;
import me.vukas.hiperfjavapersistence.repository.jpa.inheritance.jointable.ParentJtRepository;
import me.vukas.hiperfjavapersistence.repository.jpa.inheritance.mappedsuperclass.Child2MsRepository;
import me.vukas.hiperfjavapersistence.repository.jpa.inheritance.mappedsuperclass.ParentMsRepository;
import me.vukas.hiperfjavapersistence.repository.jpa.inheritance.singletable.ParentStRepository;
import me.vukas.hiperfjavapersistence.repository.jpa.inheritance.tableperclass.ParentTPCRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InheritanceService {

  private ParentStRepository parentStRepository;
  private ParentJtRepository parentJtRepository;
  private ParentTPCRepository parentTPCRepository;
  private ParentMsRepository parentMsRepository;
  private Child2MsRepository child2MsRepository;

  public InheritanceService(
      ParentStRepository parentStRepository,
      ParentJtRepository parentJtRepository,
      ParentTPCRepository parentTPCRepository,
      ParentMsRepository parentMsRepository,
      Child2MsRepository child2MsRepository) {
    this.parentStRepository = parentStRepository;
    this.parentJtRepository = parentJtRepository;
    this.parentTPCRepository = parentTPCRepository;
    this.parentMsRepository = parentMsRepository;
    this.child2MsRepository = child2MsRepository;
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

  @Transactional
  public ParentMs saveParentMs(ParentMs parentMs){
    return parentMsRepository.save(parentMs);
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

  @Transactional(readOnly = true)
  public Optional<Child2Ms> getChild2Ms(Long id) {
    return child2MsRepository.findById(id);
  }
}
