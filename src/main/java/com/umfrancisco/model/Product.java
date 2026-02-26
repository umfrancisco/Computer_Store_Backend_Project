package com.umfrancisco.model;

import java.util.Random;

public class Product {
	private final long id;
	private final String manufacturer;
	private final String model;
	private final double price;
	private int stock;
	private Random random = new Random();
	
	public Product(String manufacturer, String model, double price, int stock) {
		id = random.nextLong(10_000);
		this.manufacturer = manufacturer.toUpperCase();
		this.model = model.toUpperCase();
		this.price = price;
		if (stock < 0) {
			System.err.println("Can not register negative numbers for stock");
			this.stock = 0;
		} else {
			this.stock = stock;
		}
	}
	
	public long getId() {
		return id;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		String standardOutput = """
				Manufacturer: %s
				Model: %s
				Code: %d
				Price: $%.2f
				Available: %d
				""".formatted(manufacturer, model, id, price, stock);
		if (stock == 0) {
			String soldOutFormat = """
				Manufacturer: %s
				Model: %s
				Code: %d
				SOLD OUT
				""".formatted(manufacturer, model, id);
			return soldOutFormat;
		}
		return standardOutput;
	}
}
