package com.example.advInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdvancedInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedInjectionApplication.class, args);
	}

	@Bean("alabala")
	public SimpleLogger newBean(){
		return new SimpleLogger() {
			@Override
			public void printMessage(String message) {
				System.out.println(message);
			}
		};
	}

}
