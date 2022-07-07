package com.example.ex10.mappers;

import com.example.ex10.entities.Book;
import com.example.ex10.model.BookForm;
import com.example.ex10.service.Mapper;
import org.springframework.stereotype.Service;

@Service
public class BookMapper implements Mapper<Book, BookForm> {
    @Override
    public BookForm convertToDto(Book entity) {
        return null;
    }

    @Override
    public Book convertToEntity(BookForm dto) {
        Book bookEntity = new Book();

        bookEntity.setId(dto.getId());
        bookEntity.setAuthor(dto.getAuthor());
        bookEntity.setISBN(dto.getISBN());
        bookEntity.setTitle(dto.getTitle());
        bookEntity.setPagesNum(dto.getPagesNum());
        return bookEntity;
    }
}

