package com.umfrancisco.model;

import java.util.Random;
import com.umfrancisco.util.Utils;

public class Product {
	private final long id;
	private final String manufacturer;
	private final String model;
	private final double price;
	private int stock;
	private Random random = new Random();
	
	protected Product(String manufacturer, String model, double price, int stock) {
		id = random.nextLong(10_000);
		this.manufacturer = manufacturer.toUpperCase();
		this.model = model.toUpperCase();
		this.price = price;
		this.stock = stock;
	}
	
	public static Product getInstance(String manufacturer, String model, double price, int stock) {
		if (price < 0 || stock < 0) {
			System.err.println(Utils.operationTime()+": Insert positive values for price and stock");
			return null;
		}
		return new Product(manufacturer, model, price, stock);
	}
	
	public long getId() {
		return id;
	}
	public String getManufacturer() {
		return manufacturer;
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
				Manufacturer: %s
				Model: %s
				Code: %d
				Price: $%.2f
				""".formatted(manufacturer, model, id, price, stock);
	}
}
