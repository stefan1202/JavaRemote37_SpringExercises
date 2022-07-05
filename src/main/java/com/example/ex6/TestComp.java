package com.example.ex6;

import com.example.appProps.PropertiesGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component

public class TestComp implements CommandLineRunner {
    @Autowired
    private PropertiesGroupEx6 propertiesGroupeEx6;
    @Override
    public void run(String... args) throws Exception {

    }
}
