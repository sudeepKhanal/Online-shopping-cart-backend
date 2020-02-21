package com.prenaka.onlineshopping.service;

import java.util.List;

import com.prenaka.onlineshopping.dto.ProductDto;

public interface ProductSercice {
	void saveProduct(ProductDto productDto);

	void updateProduct(ProductDto productDto);

	void deleteProduct(Long id);

	ProductDto getProductById(Long id);

	List<ProductDto> getAllProduct();

}
