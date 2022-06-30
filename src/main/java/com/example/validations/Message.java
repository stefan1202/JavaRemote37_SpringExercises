package com.example.validations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

  @NotNull
  private String from;

  @NotNull
  private String to;

  @NotNull
  @Length(min = 5)
  private String message;
}