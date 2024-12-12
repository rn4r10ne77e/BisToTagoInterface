package com.geon.bis.link.tago.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BeanUtil implements ApplicationContextAware {

  private static ApplicationContext context;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    // TODO Auto-generated method stub
    context = applicationContext;
  }

  // 빈 이름으로 찾기
  public static <T> T getBeanByName(String beanName, Class<T> beanClass) {
    return context.getBean(beanName, beanClass);
  }

  // 클래스 타입으로 찾기 (Primary 빈 우선)
  public static <T> T getBeanByType(Class<T> beanClass) {
    Map<String, T> beans = context.getBeansOfType(beanClass);

    if (beans.size() == 1) {
      return beans.values().iterator().next();
    }

    // @Primary 어노테이션이 붙은 빈 찾기
    List<T> primaryBeans = beans.values().stream()
      .filter(bean -> bean.getClass().isAnnotationPresent(Primary.class))
      .toList();

    // @Primary 빈이 정확히 하나인 경우에만 반환
    if (primaryBeans.size() == 1) {
      return primaryBeans.get(0);
    } else if (primaryBeans.isEmpty()) {
      throw new NoSuchBeanDefinitionException("No @Primary bean found for type " + beanClass.getName());
    } else {
      throw new IllegalStateException("Multiple @Primary beans found for type " + beanClass.getName());
    }
  }

  // 프로퍼티 값 가져오기
  public static String getProperty(String key) {
    Environment environment = context.getBean(Environment.class);
    return environment.getProperty(key);
  }
}
