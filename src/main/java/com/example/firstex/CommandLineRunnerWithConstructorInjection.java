package com.example.firstex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private DummyLogger dummyLogger1;

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger1.sayHello();
    }

    public CommandLineRunnerWithConstructorInjection(DummyLogger dummyLogger1) {
        this.dummyLogger1 = dummyLogger1;
    }
}