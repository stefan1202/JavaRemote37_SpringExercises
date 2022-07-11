package com.example.jpa;

import com.example.exceptions.SdaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController

@EnableGlobalMethodSecurity(securedEnabled = true)
public class JpaController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/book")
    @Secured("ROLE_ADMIN")
    public List<Book> getAllBooks(){
        return (List<Book>) bookRepository.findAll();
    }

    @RolesAllowed("ADMIN")
    @GetMapping("/book/find")
    public List<Book> findBooksByName(@RequestParam String name){
        return bookRepository.findBooksByNameStartingWith(name);
    }

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@RequestBody Book book,@PathVariable Long id){
        String errorMEssage = "Book id not found" + id;
        Book book2Update= bookRepository.findById(id).orElseThrow(() -> new SdaException(errorMEssage));

        return bookRepository.save(book);
    }

    @DeleteMapping("/book/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteBook(@PathVariable Long id){
        String errorMEssage = "Book id not found" + id;
        Book book2Update= bookRepository.findById(id).orElseThrow(() -> new SdaException(errorMEssage));
        bookRepository.deleteById(id);
    }
}
