package com.example.ex9;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
@Entity
@Data
public class FileData {
    @Id
    @GeneratedValue
    private Long id;
    private String fileName;
    private String extension;
    private Integer sizeInKb;
    private String content;


}
