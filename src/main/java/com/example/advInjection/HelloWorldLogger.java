package com.example.advInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldLogger implements CommandLineRunner {

  private final SimpleLogger simpleLogger;

  // injecting through a constructor using an interface
  public HelloWorldLogger(@Qualifier("alabala") final SimpleLogger simpleLogger) {
    this.simpleLogger = simpleLogger;
  }


  @Override
  public void run(final String... args) throws Exception {
    simpleLogger.printMessage("Hello from command line runner");
  }
}