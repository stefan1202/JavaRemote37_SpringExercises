package com.example.thirdex;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SecondaryBean implements DummyLogger{
    @Override
    public void sayHello() {
        log.info("Hello from Secondary Bean");
    }
}
