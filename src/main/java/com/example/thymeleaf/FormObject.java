package com.example.thymeleaf;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class FormObject {
    @Length (min=13,max = 13)
    private String cnp;

    @Length (min=3, max=20)
    private String nume;
    private String prenume;
    @Email
    @NotBlank(message = "Emailul este obligatoriu")
    private String email;


}
