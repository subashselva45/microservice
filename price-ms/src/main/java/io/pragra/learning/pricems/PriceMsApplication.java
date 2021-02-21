package io.pragra.learning.pricems;

import io.pragra.learning.pricems.domain.BookPricing;
import io.pragra.learning.pricems.repo.PriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PriceMsApplication {
    @Autowired
    private PriceRepo repo;

    public static void main(String[] args) {

        SpringApplication.run(PriceMsApplication.class, args);
    }

@Bean
CommandLineRunner runner(){
        return args -> {
            repo.save(new BookPricing(1L,10000L,2000));
            repo.save(new BookPricing(2L,20000L,3000));
            repo.save(new BookPricing(3L,30000L,4000));
            repo.save(new BookPricing(4L,40000l,5000));
        };
}
}
