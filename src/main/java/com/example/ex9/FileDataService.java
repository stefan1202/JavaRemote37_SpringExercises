package com.example.ex9;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FileDataService {
    Repo repo;

    public FileDataCollection findAll() {
        return new FileDataCollection((List<FileData>) repo.findAll()) ;
    }

    public FileData save(FileData fileData) {
        return repo.save(fileData);
    }
}
