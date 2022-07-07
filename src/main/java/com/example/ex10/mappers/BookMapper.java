package com.example.ex10.mappers;

import com.example.ex10.entities.Book;
import com.example.ex10.model.BookForm;
import com.example.ex10.service.Mapper;
import org.springframework.stereotype.Service;

@Service
public class BookMapper implements Mapper<Book, BookForm> {
    @Override
    public BookForm convertToDto(Book entity) {
        BookForm dto = new BookForm();
        dto.setId(entity.getId());
        dto.setAuthor(entity.getAuthor());
        dto.setIsbn(entity.getISBN());
        dto.setTitle(entity.getTitle());
        dto.setPagesNum(entity.getPagesNum());

        return dto;

    }

    @Override
    public Book convertToEntity(BookForm dto) {
        Book bookEntity = new Book();
        if (dto.getId() != null) {
            bookEntity.setId(dto.getId());
        }
        bookEntity.setAuthor(dto.getAuthor());
        bookEntity.setISBN(dto.getIsbn());
        bookEntity.setTitle(dto.getTitle());
        bookEntity.setPagesNum(dto.getPagesNum());
        return bookEntity;
    }
}

