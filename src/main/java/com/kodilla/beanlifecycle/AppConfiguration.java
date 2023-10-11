package com.kodilla.beanlifecycle;

import org.springframework.context.annotation.*;

/**
 * User: Z6PWA
 * Date: 11.10.2023
 */
@Configuration
public class AppConfiguration
{
  @Bean
  @Scope("prototype")
  public LibraryManager libraryManager() {
    return new LibraryManager();
  }
}
