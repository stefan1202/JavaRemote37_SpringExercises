package com.example.appProps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SomeBean implements CommandLineRunner {

  @Value("${pl.sdacademy.example}")
  private String injectedValue;

  @Value("${pl.sdacademy.example2:Ana}")
  private String injectedValue2;

  @Value("${java.home}")
  private String javaHome;

  @Autowired
  private PropertiesGroup propertiesGroup;

  private final AnotherBean anotherBean;

  public SomeBean(final AnotherBean anotherBean) {
    this.anotherBean = anotherBean;
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(injectedValue);
    System.out.println(injectedValue2);
    System.out.println(javaHome);
    System.out.println("Properties group" + propertiesGroup);
  }

}
