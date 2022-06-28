package com.example.advInjection;

import org.springframework.stereotype.Component;

// a context-registered component implementing the interface that will be injected
@Component 
public class SimpleConsoleLogger implements SimpleLogger {

  @Override
  public void printMessage(final String message) {
    System.out.println("Hello from component that implements interface");
  }
}