package com.example.thirdex;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Primary
public class PrimaryBean implements DummyLogger{
    @Override
    public void sayHello() {
        log.info("Hello from primary");
    }
}
