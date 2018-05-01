package ru.kai.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kai.service.models.Product;

import java.util.Optional;

public interface ProductsRepository extends JpaRepository<Product, Long> {
    Optional<Product> findOneById(Long id);
}
