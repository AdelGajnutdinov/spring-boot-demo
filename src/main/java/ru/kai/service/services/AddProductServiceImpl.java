package ru.kai.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kai.service.forms.ProductForm;
import ru.kai.service.models.Product;
import ru.kai.service.repositories.ProductsRepository;

@Service
public class AddProductServiceImpl implements AddProductService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public void addProduct(ProductForm productForm) {
        Product product = Product.builder()
                .name(productForm.getName())
                .price(productForm.getPrice())
                .build();
        productsRepository.save(product);
    }
}
