package com.example.ex9;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface Repo extends CrudRepository<FileData, UUID> {



}
