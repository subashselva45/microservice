package io.pragra.learning.bookservice.controller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PriceResponse {

    private Long id;
    private Long isbn;
    private double price;
}
