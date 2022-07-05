package com.example.ex6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component // or //@EnableConfigurationProperties(PropertiesGroup.class)
@ConfigurationProperties(prefix = "pl.sdacademy.zad6")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertiesGroupEx6 {

    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private Integer age;
    private String[] values;
    private Map<String, String> customAttributes;
}

