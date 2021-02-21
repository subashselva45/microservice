package io.pragra.learning.pricems.controller;

import io.pragra.learning.pricems.domain.BookPricing;
import io.pragra.learning.pricems.repo.PriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
    @Autowired
    private PriceRepo repo;

    @GetMapping("/price/{isbn}")
    public BookPricing getPriceByIsbn(@PathVariable Long isbn){
        return repo.findByIsbn(isbn);
    }
}
