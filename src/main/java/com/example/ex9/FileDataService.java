package com.example.ex9;

import com.example.exceptions.SdaException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FileDataService {
    FileDataRepository repo;

    public FileDataCollection findAll() {
        return new FileDataCollection((List<FileData>) repo.findAll()) ;
    }

    public FileData save(FileData fileData) {
        return repo.save(fileData);
    }

    public FileData findByID(Long id) {
       return repo.findById(id).orElseThrow(()-> new SdaException("Element not found for id:"+ id));
    }


    public void updateObject(Long id, FileData fileData) {
        repo.findById(id).orElseThrow(()-> new SdaException("Object not found for id:" + id));
        repo.save(fileData);
    }
}
