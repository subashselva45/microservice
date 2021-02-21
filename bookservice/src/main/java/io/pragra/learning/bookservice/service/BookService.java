package io.pragra.learning.bookservice.service;

import io.pragra.learning.bookservice.controller.PriceResponse;
import io.pragra.learning.bookservice.domain.Book;
import io.pragra.learning.bookservice.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private BookRepo repo;
    private RestTemplate restTemplate;

    public BookService(BookRepo repo, RestTemplate restTemplate) {
        this.repo = repo;
        this.restTemplate = restTemplate;
    }

    public Book createBook(Book book) {
        return repo.save(book);
    }

    public  Book getBookById(Long id){
        Optional<Book> book = repo.findById(id);
        if(book.isPresent()){
            PriceResponse forObject = restTemplate.getForObject("http://localhost:9020/price/{isbn}", PriceResponse.class, 10000L);
            book.get().setPrice(forObject.getPrice());
        }
        return book.get();
    }
    public List<Book> getBooks()
    {
       return  repo.findAll();
    }
}
