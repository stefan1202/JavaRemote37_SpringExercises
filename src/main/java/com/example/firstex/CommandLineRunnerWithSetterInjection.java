package com.example.firstex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {

    private DummyLogger dummyLogger2;

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger2.sayHello();
    }

    @Autowired
    public void setDummyLogger2(DummyLogger dummyLogger2) {
        this.dummyLogger2 = dummyLogger2;
    }
}