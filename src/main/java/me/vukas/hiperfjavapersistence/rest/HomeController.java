package me.vukas.hiperfjavapersistence.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("some")
  public String getSome(){
    return "Some";
  }

}
