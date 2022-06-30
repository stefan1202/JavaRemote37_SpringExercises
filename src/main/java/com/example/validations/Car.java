package com.example.validations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
  private Long id;

  @NotNull
  @Length(min = 3)
  private String name;

  @Min(1)
  private Integer wheelsNumber;
}