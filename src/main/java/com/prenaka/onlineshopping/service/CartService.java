package com.prenaka.onlineshopping.service;

import java.util.List;

import com.prenaka.onlineshopping.dto.CartDto;

public interface CartService {
	void saveCart(CartDto cartDto);

	void updateCart(CartDto cartDto);

	void deleteCart(Long id);

	CartDto getCartById(Long id);

	List<CartDto> getAllCart();

}
