package me.vukas.hiperfjavapersistence.rest;

import com.querydsl.core.types.Predicate;
import me.vukas.hiperfjavapersistence.dto.PageDto;
import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiNoCommentsReadDto;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.onetomany.PostOneBi;
import me.vukas.hiperfjavapersistence.service.OneToManyBiService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneToManyBiController {

  private OneToManyBiService service;

  public OneToManyBiController(OneToManyBiService service) {
    this.service = service;
  }

  /**
   * With this, I can query any of entity properties: http://localhost:8080/postOneBi?updateThis=writeUpdateThis15
   * postOneBi?updateThis=writeUpdateThis18&updateThis=writeUpdateThis20 -> updateThis IN (...18, ...20)
   * postOneBi?updateThis=writeUpdateThis18 -> updateThis EQ ...18
   * postOneBi?comments.updateThis=writeComUpdate1:1 -> comments is a collection; any comments.updateThis eq ...1:1
   */
  @GetMapping("/postOneBi")
  public PageDto<PostOneBiNoCommentsReadDto> getOneToManyBi(
      @QuerydslPredicate(root = PostOneBi.class) Predicate predicate,
      Pageable pageable //page=0, size=20 by default; [postOneBi?page=1&size=30&sort=enumeration,desc&sort=updateThis,asc]
  ){
    return service.getByPredicate(predicate, pageable);
  }

  @GetMapping("/postOneBi/insert")  //this should be POST
  public void insertPosts(){
    service.insertPostsOneBi();
  }
}
