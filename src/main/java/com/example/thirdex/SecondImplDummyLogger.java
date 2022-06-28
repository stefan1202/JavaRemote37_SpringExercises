package com.example.thirdex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondImplDummyLogger implements CommandLineRunner {

    @Autowired
    @Qualifier("secondaryBean")
    DummyLogger dummyLogger;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Second");
        dummyLogger.sayHello();
    }
}
