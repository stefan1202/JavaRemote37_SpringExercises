package com.example.ex10.service;


import com.example.ex10.entities.Book;
import com.example.ex10.mappers.BookMapper;
import com.example.ex10.model.BookForm;
import com.example.ex10.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    BookRepository bookRepository;
    BookMapper bookMapper;

    public void createBook(BookForm bookDto) {
        Book bookEntity=bookMapper.convertToEntity(bookDto);
        bookRepository.save(bookEntity);
    }
}
