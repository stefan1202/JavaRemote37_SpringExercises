package com.example.ex10.service;

public interface Mapper <E,D>{
    D convertToDto(E entity);
    E convertToEntity(D dto);
}

