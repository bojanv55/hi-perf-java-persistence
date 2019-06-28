package me.vukas.hiperfjavapersistence.service;

import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiReadDto;
import me.vukas.hiperfjavapersistence.repository.JooqRepository;
import org.springframework.stereotype.Service;

@Service
public class JooqService {

  private JooqRepository jooqRepository;

  public JooqService(JooqRepository jooqRepository) {
    this.jooqRepository = jooqRepository;
  }

  public PostOneBiReadDto getPostOneBi(Long id){
    return jooqRepository.getPostOneBi(id);
  }

}
