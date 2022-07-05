package com.example.ex9;

import com.example.jpa.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Repo repo;

    @GetMapping("/api/files-data")
    public List<FileData> getAllData(){
        return (List<FileData>) repo.findAll();
    }
    @PostMapping("/api/files-data")
    public FileData createFile(@RequestBody FileData   fileData){
        return repo.save(fileData);
    }
}
