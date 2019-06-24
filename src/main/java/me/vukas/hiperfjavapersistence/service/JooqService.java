package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiDto;
import me.vukas.hiperfjavapersistence.repository.JooqRepository;
import org.springframework.stereotype.Service;

@Service
public class JooqService {

  private JooqRepository jooqRepository;

  public JooqService(JooqRepository jooqRepository) {
    this.jooqRepository = jooqRepository;
  }

  public PostOneBiDto getPostOneBi(Long id){
    return jooqRepository.getPostOneBi(id);
  }

}
