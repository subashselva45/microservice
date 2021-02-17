package io.pragra.learning.bookservice;

import io.pragra.learning.bookservice.domain.Book;
import io.pragra.learning.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class BookserviceApplication {
    @Autowired
    private BookService service;

    public static void main(String[] args) {
        SpringApplication.run(BookserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
            this.service.createBook(new Book(1L,"Learning Java","A", 300.00));
            this.service.createBook(new Book(2L,"Learning python","B", 200.00));
            this.service.createBook(new Book(3L,"Learning Angular","C", 100.00));
        };
    }

}
