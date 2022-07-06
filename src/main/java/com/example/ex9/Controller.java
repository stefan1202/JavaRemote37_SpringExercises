package com.example.ex9;

import com.example.exceptions.SdaException;
import com.example.jpa.Book;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
public class Controller {
    public static final String API_FILES_DATA = "/api/files-data";
    FileDataService fileDataService;


    @GetMapping(API_FILES_DATA)
    public FileDataCollection getAllData() {
        return fileDataService.findAll();
    }

    @PostMapping(API_FILES_DATA)
    public ResponseEntity<FileData> createFile(@RequestBody FileData fileData) throws URISyntaxException {
        FileData objectCreated = fileDataService.save(fileData);
        return ResponseEntity.created(new URI(API_FILES_DATA + "/" + objectCreated.getId())).build();
    }

    @GetMapping(API_FILES_DATA + "/{id}")
    public FileData getById(@PathVariable Long id) {
        return fileDataService.findByID(id);
    }

    @PutMapping(API_FILES_DATA + "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateFileDataById(@RequestBody FileData fileData, @PathVariable Long id){
        fileDataService.updateObject(id,fileData);
    }

    @ExceptionHandler(SdaException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String errorHandler(SdaException exception){
        return exception.getMessage();
    }


}
