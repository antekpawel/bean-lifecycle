package com.kodilla.beanlifecycle;

import org.springframework.context.annotation.*;

/**
 * User: Z6PWA
 * Date: 05.10.2023
 */
@Configuration
public class AppConfig
{

  @Bean
  public BeanMonitor beanMonitor() {
    return new BeanMonitor();
  }

  @Bean
  public BeanCreationMonitor beanCreationMonitor() {
    return new BeanCreationMonitor();
  }
}
