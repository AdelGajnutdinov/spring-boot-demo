package ru.kai.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kai.service.models.CartProducts;
import ru.kai.service.models.Product;
import ru.kai.service.repositories.CartProductsRepository;
import ru.kai.service.security.details.UserDetailsImpl;
import ru.kai.service.transfer.CartProductDto;
import ru.kai.service.transfer.UserDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ProfileController {
    @Autowired
    private CartProductsRepository cartProductsRepository;

    @GetMapping("/")
    public String getProfilePage(ModelMap model, Authentication authentication) {
        if (authentication == null) {
            return "redirect:/login";
        }

        UserDetailsImpl details = (UserDetailsImpl)authentication.getPrincipal();
        UserDto user = UserDto.from(details.getUser());
        model.addAttribute("user", user);

        List<CartProducts> cartProducts = cartProductsRepository.findAllByUser_Id(user.getId());
        List<CartProductDto> cartProductDtos = new ArrayList<>();
        BigDecimal totalPrice = new BigDecimal(0);

        for (CartProducts cartProduct : cartProducts) {
            CartProductDto currentCartProductDto = CartProductDto.from(cartProduct);
            cartProductDtos.add(currentCartProductDto);
            totalPrice = totalPrice.add(
                    currentCartProductDto.getPrice().multiply(BigDecimal.valueOf(cartProduct.getProductCount())));
        }

        model.addAttribute("productsFromServer", cartProductDtos);
        model.addAttribute("totalPrice", totalPrice);
        return "profile";
    }
}
