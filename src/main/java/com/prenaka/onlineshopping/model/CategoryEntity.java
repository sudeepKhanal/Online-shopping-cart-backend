package com.prenaka.onlineshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category_tbl")
public class CategoryEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "category_name")
	private String categoryName;
	private String description;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
