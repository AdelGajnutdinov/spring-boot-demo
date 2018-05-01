package ru.kai.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kai.service.forms.ProductForm;
import ru.kai.service.services.AddProductService;

@Controller
public class AddProductController {

    @Autowired
    private AddProductService addProductService;

    @GetMapping("/addProduct")
    public String getAddProductPage() {
        return "addProduct";
    }

    @PostMapping("addProduct")
    public String addProduct(ProductForm productForm) {
        addProductService.addProduct(productForm);
        return "redirect:/products";
    }
}
