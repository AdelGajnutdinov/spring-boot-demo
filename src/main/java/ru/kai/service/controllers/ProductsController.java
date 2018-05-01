package ru.kai.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kai.service.forms.OrderForm;
import ru.kai.service.repositories.ProductsRepository;
import ru.kai.service.services.CartProductsService;

@Controller
public class ProductsController {

    @Autowired
    private CartProductsService cartProductsService;
    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping("/products")
    public String getProductsPage(ModelMap modelMap) {
        modelMap.addAttribute("productsFromServer", productsRepository.findAll());
        return "products";
    }

    @PostMapping("/products")
    public String addProductToCart(OrderForm orderForm) {
        cartProductsService.addToCart(orderForm);
        return "redirect:/";
    }
}
