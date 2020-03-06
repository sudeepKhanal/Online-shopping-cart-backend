package com.prenaka.onlineshopping.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prenaka.onlineshopping.dto.CartDto;
import com.prenaka.onlineshopping.model.CartEntity;
import com.prenaka.onlineshopping.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	private final CartRepository cartRepository;

	@Autowired
	public CartServiceImpl(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}

	@Override
	public void saveCart(CartDto cartDto) {
		CartEntity cartEntity = new CartEntity();
		BeanUtils.copyProperties(cartDto, cartEntity);
		cartRepository.save(cartEntity);
	}

	@Override
	public void updateCart(CartDto cartDto) {
		CartEntity cartEntity = new CartEntity();
		BeanUtils.copyProperties(cartDto, cartEntity);
		cartRepository.save(cartEntity);
	}

	@Override
	public void deleteCart(Long id) {
		cartRepository.deleteById(id);

	}

	@Override
	public CartDto getCartById(Long id) {
		CartDto cartDto = new CartDto();
		BeanUtils.copyProperties(cartRepository.findById(id), cartDto);
		return cartDto;
	}

	@Override
	public List<CartDto> getAllCart() {
		return cartRepository.findAll().stream().map(cartEntity -> {
			CartDto cartDto = new CartDto();
			BeanUtils.copyProperties(cartEntity, cartDto);
			return cartDto;
		}).collect(Collectors.toList());
	}

}
