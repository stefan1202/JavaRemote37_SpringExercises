package com.example.thirdex;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FirstImplDummyLogger implements CommandLineRunner {

    DummyLogger dummyLogger;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("First");
        dummyLogger.sayHello();
    }


}
