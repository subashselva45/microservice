package io.pragra.learning.bookservice.controller;

import io.pragra.learning.bookservice.domain.Book;
import io.pragra.learning.bookservice.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {
    private BookService service;

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book) {
        return this.service.createBook(book);
    }

    @GetMapping("/book")
    public List<Book> getBooks() {
        return this.service.getBooks();
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Long id)
    {
        return this.service.getBookById(id);
    }
}
