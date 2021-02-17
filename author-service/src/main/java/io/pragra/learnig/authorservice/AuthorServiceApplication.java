package io.pragra.learnig.authorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class AuthorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorServiceApplication.class, args);
    }


    @GetMapping("/api/author")
    public List<Author> getAll() {
        return Arrays.asList(new Author("Subash"), new Author("Karthick"));
    }


    class Author {
        private String name;

        public Author() {

        }

        public Author(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String setName() {
            return this.name = name;
        }
    }
}
