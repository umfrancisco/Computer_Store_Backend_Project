package com.umfrancisco.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_tb")
public class Product {
	
	@Id
	private long id;
	private String model;
	private double price;
	
	public Product() {
		
	}
	
	public Product(long id, String model, double price) {
		this.id = id;
		this.model = model;
		this.price = price;
	}
	
	public long getId() {
		return id;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", model=" + model + ", price=" + price + "]";
	}
}
