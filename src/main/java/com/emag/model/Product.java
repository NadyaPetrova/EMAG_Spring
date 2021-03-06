package com.emag.model;

import java.util.Date;

public class Product {

	private long productID;
	private String brand;
	private String model;
	private String description;
	private String productPicture;
	private double price;
	private int availability;
	private int discountPercent;
	private Date discountExpiration;
	private Category category = new Category();

	//==============GETTERS=====================
	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public long getProductID() {
		return productID;
	}

	public String getDescription() {
		return description;
	}

	public String getProductPicture() {
		return productPicture;
	}

	public int getAvailability() {
		return availability;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public Date getDiscountExpiration() {
		return discountExpiration;
	}
	
	public Category getCategory() {
		return category;
	}
	
	//==========BUILDER DESIGN PATTERN==========
	
	public Product withProductID(long productID) {
		this.productID = productID;
		return this;
	}

	public Product withBrand(String brand) {
		if (brand != null && !brand.isEmpty()) {
			this.brand = brand;
		}
		return this;
	}

	public Product withModel(String model) {
		if (model != null && !model.isEmpty()) {
			this.model = model;
		}
		return this;
	}

	public Product withDescription(String description) {
		this.description = description;
		return this;
	}

	public Product withProductPicture(String productPicture) {
		if (productPicture != null && !productPicture.isEmpty()) {
			this.productPicture = productPicture;
		}
		return this;
	}

	public Product withPrice(double price) {
		if (price >= 0) {
			this.price = price;
		}
		return this;
	}

	public Product withAvailability(int availability) {
		this.availability = availability;
		return this;
	}

	public Product withDiscountPercent(int discountPercent) {
		if (discountPercent >= 0) {
			this.discountPercent = discountPercent;
		}
		return this;
	}

	public Product withDiscountExpiration(Date discountExpiration) {
		this.discountExpiration = discountExpiration;
		return this;
	}

	public Product withCategory(Category category) {
		this.category = category;
		return this;
	}
	
	public Product withCategoryName(String categoryName) {
		this.category.setCategoryName(categoryName);
		return this;
	}
	
	public Product withCategoryID(int categoryID) {
		this.category.setCategoryID(categoryID);
		return this;
	}
	
	//================SETTERS===================

	public void setProductID(long productID) {
		this.productID = productID;
	}
	
	public void setProductPicture(String productPicture) {
		this.productPicture = productPicture;
	}
	
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public void setCategoryName(String categoryName) {
		this.category.setCategoryName(categoryName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (productID ^ (productID >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productID != other.productID)
			return false;
		return true;
	}
	
	
}