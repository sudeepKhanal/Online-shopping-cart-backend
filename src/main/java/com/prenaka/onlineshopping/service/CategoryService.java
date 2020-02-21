package com.prenaka.onlineshopping.service;

import java.util.List;

import com.prenaka.onlineshopping.dto.CategoryDto;
import com.prenaka.onlineshopping.dto.ProductDto;

public interface CategoryService {
	
	void saveCategory(CategoryDto categoryDto);

	void updateCategory(CategoryDto categoryDto);

	void deleteCategory(Long id);

	CategoryDto getCategoryById(Long id);

	List<CategoryDto> getAllCategory();

}
