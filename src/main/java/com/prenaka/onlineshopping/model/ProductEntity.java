package com.prenaka.onlineshopping.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_tbl")
public class ProductEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_status")
	private Boolean productStatus;
	@Column(name = "product_description")
	private String productDescription;
	@Column(name = "product_price")
	private BigDecimal productPrice;
	private int quantity;
	@JoinColumn(name = "category_id")
	@ManyToOne
	private CategoryEntity categoryId;
	@Column(name = "product_image_path")
	private String productImagePath;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CategoryEntity getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(CategoryEntity categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductImagePath() {
		return productImagePath;
	}

	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}

}
