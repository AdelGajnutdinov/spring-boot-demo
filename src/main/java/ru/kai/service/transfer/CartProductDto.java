package ru.kai.service.transfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.kai.service.models.CartProducts;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class CartProductDto {
    private Long code;
    private String name;
    private BigDecimal price;
    private int count;

    public static CartProductDto from(CartProducts cartProducts) {
        return CartProductDto.builder()
                .code(cartProducts.getProduct().getId())
                .name(cartProducts.getProduct().getName())
                .price(cartProducts.getProduct().getPrice())
                .count(cartProducts.getProductCount())
                .build();
    }
}
