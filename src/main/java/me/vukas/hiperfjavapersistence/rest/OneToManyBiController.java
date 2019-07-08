package me.vukas.hiperfjavapersistence.rest;

import com.querydsl.core.types.Predicate;
import me.vukas.hiperfjavapersistence.dto.PageDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiNoCommentsReadDto;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.service.OneToManyBiService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneToManyBiController {

  private OneToManyBiService service;

  public OneToManyBiController(OneToManyBiService service) {
    this.service = service;
  }

  /**
   * With this, I can query any of entity properties: http://localhost:8080/postOneBi?updateThis=writeUpdateThis15
   */
  @GetMapping("/postOneBi")
  public PageDto<PostOneBiNoCommentsReadDto> getOneToManyBi(
      @QuerydslPredicate(root = PostOneBi.class) Predicate predicate,
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "20") int size
  ){
    return service.getByPredicate(predicate, PageRequest.of(page, size));
  }

  @GetMapping("/postOneBi/insert")  //this should be POST
  public void insertPosts(){
    service.insertPostsOneBi();
  }
}
