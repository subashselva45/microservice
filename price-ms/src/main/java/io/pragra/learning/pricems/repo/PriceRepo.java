package io.pragra.learning.pricems.repo;

import io.pragra.learning.pricems.domain.BookPricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepo extends JpaRepository<BookPricing,Long> {
    BookPricing findByIsbn(Long isbn);
}
