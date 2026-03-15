package com.umfrancisco.model;

public class Product {
	private final long id;
	private final String model;
	private final double price;
	private int stock;
	private final Category category;
	
	protected Product(long id, String model, double price, int stock, Category category) {
		this.id = id;
		this.model = model.toUpperCase();
		this.price = price;
		this.stock = stock;
		this.category = category;
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
