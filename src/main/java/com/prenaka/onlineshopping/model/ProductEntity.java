package com.prenaka.onlineshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_tbl")
public class ProductEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "product_name")
	private String productName;
	private int quantity;
	private String description;
	@Column(name = "category_id")
	private CategoryEntity categoryId;
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

	public CategoryEntity getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(CategoryEntity categoryId) {
		this.categoryId = categoryId;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
