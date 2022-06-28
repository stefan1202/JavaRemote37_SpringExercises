package com.example.advInjection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("simpleLogger")
@Slf4j
public class SimpleLoggerImpl implements SimpleLogger{
    @Override
    public void printMessage(String message) {
        log.info(message);
    }
}
