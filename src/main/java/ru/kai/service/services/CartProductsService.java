package ru.kai.service.services;

import ru.kai.service.forms.OrderForm;

public interface CartProductsService {
    void addToCart(OrderForm orderForm);
}
