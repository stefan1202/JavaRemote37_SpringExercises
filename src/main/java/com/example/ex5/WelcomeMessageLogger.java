package com.example.ex5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WelcomeMessageLogger implements CommandLineRunner {
    private String text;
    private Boolean shouldLog;

    @Override
    public void run(String... args) throws Exception {
        if (Boolean.TRUE.equals(shouldLog)) {
            System.out.println(text);

        }
    }

    public WelcomeMessageLogger(@Value("${pl.sdacademy.welcome.text.value: none}") String text,
                                @Value("${pl.sdacademy.welcome.text.enable}") Boolean shouldLog) {
        this.text = text;
        this.shouldLog = shouldLog;
    }
}