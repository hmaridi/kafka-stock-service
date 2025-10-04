package com.stock.srvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String category;
    private String price;
    private int availableItems;
    private int reservedItems;

    public Product() {
    }

	public Product(Long id, String productName, String category, String price, int availableItems, int reservedItems) {
		super();
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.availableItems = availableItems;
		this.reservedItems = reservedItems;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getAvailableItems() {
		return availableItems;
	}

	public void setAvailableItems(int availableItems) {
		this.availableItems = availableItems;
	}

	public int getReservedItems() {
		return reservedItems;
	}

	public void setReservedItems(int reservedItems) {
		this.reservedItems = reservedItems;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", category=" + category + ", price=" + price
				+ ", availableItems=" + availableItems + ", reservedItems=" + reservedItems + "]";
	}
    

    }
