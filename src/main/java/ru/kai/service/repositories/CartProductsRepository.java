package ru.kai.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kai.service.models.CartProducts;
import ru.kai.service.models.Product;

import java.util.List;

public interface CartProductsRepository extends JpaRepository<CartProducts, Long> {
    List<CartProducts> findAllByUser_Id(Long id);
}
