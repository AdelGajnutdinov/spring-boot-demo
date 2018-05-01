package ru.kai.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.kai.service.forms.OrderForm;
import ru.kai.service.models.CartProducts;
import ru.kai.service.models.Product;
import ru.kai.service.models.User;
import ru.kai.service.repositories.CartProductsRepository;
import ru.kai.service.repositories.ProductsRepository;
import ru.kai.service.repositories.UsersRepository;

@Service
public class CartProductsServiceImpl implements CartProductsService {

    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private ProductsRepository productsRepository;
//    @Autowired
//    private CartRepository cartRepository;
    @Autowired
    private CartProductsRepository cartProductsRepository;

    @Override
    public void addToCart(OrderForm orderForm) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUserLogin = authentication.getName();
            User user = usersRepository.findOneByLogin(currentUserLogin)
                    .orElseThrow(IllegalArgumentException::new);
            System.out.println(user);
            Product product = productsRepository.findOneById(orderForm.getCode())
                    .orElseThrow(IllegalArgumentException::new);
            System.out.println(product);
            CartProducts cartProducts = CartProducts.builder()
                    .user(user)
                    .product(product)
                    .productCount(orderForm.getCount())
                    .build();
            System.out.println(cartProducts);
            cartProductsRepository.save(cartProducts);
        }
        else throw new IllegalStateException("No authorised user found!");
    }
}
