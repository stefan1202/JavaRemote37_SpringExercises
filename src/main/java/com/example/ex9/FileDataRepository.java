package com.example.ex9;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FileDataRepository extends CrudRepository<FileData, Long> {

    @Query(value = "FROM FileData f ORDER BY f.fileName",nativeQuery = false)
    List<FileData> retriveAllOrderByName();

    @Query(value = "select * FROM file_data f ORDER BY f.file_name",nativeQuery = true)
    List<FileData> retriveAllOrderByNameNative();
}
