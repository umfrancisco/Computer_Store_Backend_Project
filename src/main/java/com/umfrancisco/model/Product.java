package com.umfrancisco.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private long id;
	private String model;
	private double price;
	private int stock;
	private String store;
	
	public Product() {
		
	}
	
	public Product(long id, String model, double price, int stock, String store) {
		this.id = id;
		this.model = model;
		this.price = price;
		this.stock = stock;
		this.store = store;
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
	public String getStore() {
		return store;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "ID: %d, MODEL: %s, PRICE: $%.2f, STOCK: %d".formatted(id, model, price, stock);
	}
}
