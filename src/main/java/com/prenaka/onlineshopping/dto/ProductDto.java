package com.prenaka.onlineshopping.dto;

public class ProductDto extends BaseDto {

	private String productName;
	private int quantity;
	private String description;
	private CategoryDto categoryId;
	private String imagePath;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CategoryDto getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(CategoryDto categoryId) {
		this.categoryId = categoryId;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
