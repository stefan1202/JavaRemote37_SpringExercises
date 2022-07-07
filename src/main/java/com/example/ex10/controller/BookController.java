package com.example.ex10.controller;

import com.example.ex10.entities.Book;
import com.example.ex10.model.BookForm;
import com.example.ex10.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.validation.Valid;

@Controller
public class BookController {

    @Autowired
    BookService bookService;


    @GetMapping("/book")
    public String showForm(Model model) {
        model.addAttribute("bookObject", new BookForm());
        return "createBookForm";
    }

    @PostMapping("/book")
    public String createBook(@Valid @ModelAttribute("bookObject") BookForm book, Errors errors, Model model) {
        if(errors.hasErrors()){
            return "createBookForm";
        }else {
            bookService.createBook(book);
            model.addAttribute("books",bookService.getAllBooks());
            return "booksList";
        }
    }

}

