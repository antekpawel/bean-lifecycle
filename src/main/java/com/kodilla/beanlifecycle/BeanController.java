package com.kodilla.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Z6PWA
 * Date: 05.10.2023
 */
@RestController
public class BeanController
{
  private final ApplicationContext applicationContext;

  public BeanController(ApplicationContext applicationContext)
  {
    this.applicationContext = applicationContext;
  }

  @GetMapping("/bean")
  public ResponseEntity beanPostProcessor()
  {
    LibraryManager bean = applicationContext.getBean(LibraryManager.class);
    return ResponseEntity.ok("Created");
  }

}
