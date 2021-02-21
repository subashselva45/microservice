package io.pragra.learning.pricems.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookPricing {
    @Id
    private Long id;
    private Long isbn;
    private double price;
}
