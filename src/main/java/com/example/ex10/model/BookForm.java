package com.example.ex10.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Data
public class BookForm {
    @Id
    private Long id;

    @Length(min=3, max=25)
    private String title;

    @Length(min=3, max=25)
    private String author;

    @Length(min=9, max=20)
    private String ISBN;

    @Min(0)
    private Integer pagesNum;
}
