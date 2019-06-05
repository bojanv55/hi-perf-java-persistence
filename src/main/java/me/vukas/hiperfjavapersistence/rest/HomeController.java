package me.vukas.hiperfjavapersistence.rest;

import static org.springframework.http.HttpStatus.NOT_FOUND;

import me.vukas.hiperfjavapersistence.entity.StandaloneEntity;
import me.vukas.hiperfjavapersistence.service.StandaloneEntityService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class HomeController {

  private StandaloneEntityService standaloneEntityService;

  public HomeController(StandaloneEntityService standaloneEntityService){
    this.standaloneEntityService = standaloneEntityService;
  }

  @GetMapping("entity/{id}")
  public StandaloneEntity readEntity(@PathVariable Integer id){
    return standaloneEntityService.getStandaloneEntity(id)
            .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find resource"));
  }

  @GetMapping("entity/insert/{id}") //should be POST
  @ResponseStatus(HttpStatus.CREATED)
  public void addEntity(@PathVariable Integer id){
    StandaloneEntity standaloneEntity = new StandaloneEntity();
    standaloneEntity.setId(id);
    standaloneEntity.setName("NameFor" + id);
    standaloneEntityService.saveStandaloneEntity(standaloneEntity);
  }

}
