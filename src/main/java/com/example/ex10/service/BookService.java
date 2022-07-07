package com.example.ex10.service;


import com.example.ex10.entities.Book;
import com.example.ex10.mappers.BookMapper;
import com.example.ex10.model.BookForm;
import com.example.ex10.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    BookMapper bookMapper;

    public void createBook(BookForm bookDto) {
        Book bookEntity=bookMapper.convertToEntity(bookDto);
        bookRepository.save(bookEntity);
    }

    public List<BookForm> getAllBooks() {
       return bookRepository.findAll().stream().map(book -> bookMapper.convertToDto(book)).collect(Collectors.toList());
    }
}
