package com.example.ex10.controller;

import com.example.ex10.entities.Book;
import com.example.ex10.model.BookForm;
import com.example.ex10.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
        if (errors.hasErrors()) {
            return "createBookForm";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }

    @GetMapping("/book/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        BookForm form = bookService.loadBook(id);
        model.addAttribute("bookObject", form);
        return "createBookForm";
    }

    @GetMapping("/books")
    public String showAllBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "booksList";
    }

    @GetMapping("/book/delete/{id}")
    public String deleteBook(@PathVariable Long id, Model model) {
        bookService.deleteBook(id);
        return "redirect:/books";

    }

    @GetMapping("/books/author")
    @ResponseBody
    public List<BookForm> stateItems(@RequestParam(value = "q", required = false) String query) {
        return bookService.getAllBooksByAuthor(query);
    }
}

