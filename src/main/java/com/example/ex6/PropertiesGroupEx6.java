package com.example.ex6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.Map;

@Validated
@Component // or //@EnableConfigurationProperties(PropertiesGroup.class)
@ConfigurationProperties(prefix = "pl.sdacademy.zad6")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertiesGroupEx6 {

    @Email
    private String email;

    @NotNull
    @Length(min = 3, max = 20)
    private String firstName;

    @NotNull
    @Length(min = 3, max = 20)
    private String lastName;


    private String address;

    @NotNull
    @Min(18)
    private Integer age;

    @NotEmpty
    private String[] values;

    @NotEmpty
    private Map<String, String> customAttributes;

    @AssertTrue
    public boolean isAddressValid() {
        return address != null && address.split(" ").length == 2;
    }
}

