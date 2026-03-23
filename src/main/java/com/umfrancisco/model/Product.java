package com.umfrancisco.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private final long id;
	private final String model;
	private final double price;
	private int stock;
	
	public Product(long id, String model, double price, int stock) {
		this.id = id;
		this.model = model.toUpperCase();
		this.price = price;
		this.stock = stock;
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
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return """
				Model: %s
				Code: %d
				Price: $%.2f
				""".formatted(model, id, price, stock);
	}
}
