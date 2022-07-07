package com.example.ex10.mappers;

import com.example.ex10.entities.BookEntity;
import com.example.ex10.model.BookForm;
import com.example.ex10.service.Mapper;

public class BookMapper implements Mapper<BookEntity, BookForm> {
    @Override
    public BookForm convertToDto(BookEntity entity) {
        return null;
    }

    @Override
    public BookEntity convertToEntity(BookForm dto) {
        return null;
    }
}
