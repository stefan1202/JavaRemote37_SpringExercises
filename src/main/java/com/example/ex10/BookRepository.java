package com.example.ex10;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByTitle(String title);
    Optional<Book> findFirstByISBN(String isbn);
    Optional<Book> findAllByTitleAndAuthor(String title, String author);
    List<Book> findTop3ByAuthorOrderByPagesNumDesc(String author);
    List<Book> findAllByTitleStartingWith(String titleStart);
    List<Book> findAllByPagesNumBetween(Integer minPages, Integer maxPages);

    @Query("SELECT b FROM books b WHERE b.pagesNum >= :pagesNum")
    List<Book> findWherePagesNumIsGreaterThanX(@Param("pagesNum")Integer pagesNum);
}


