package com.example.thirdex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CombinedImplDummyLogger implements CommandLineRunner {

    @Autowired
    List<DummyLogger> dummyLoggerList;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Combined");
      for (DummyLogger dummyLogger:dummyLoggerList){
          dummyLogger.sayHello();
      }
    }
}
