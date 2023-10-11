package com.kodilla.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * User: Z6PWA
 * Date: 05.10.2023
 */
public class BeanMonitor implements BeanPostProcessor
{
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
  {
    System.out.println("Before: " + beanName);
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
  {
    System.out.println("After: " + beanName);
    return bean;
  }
}
