package com.umfrancisco.model;

import java.util.Random;
import com.umfrancisco.util.Utils;

public class Product {
	private final long id;
	private final String model;
	private final double price;
	private int stock;
	private Random random = new Random();
	
	protected Product(String model, double price, int stock) {
		id = random.nextLong(10_000);
		this.model = model.toUpperCase();
		this.price = price;
		this.stock = stock;
	}
	
	public static Product getInstance(String model, double price, int stock) {
		if (price < 0 || stock < 0) {
			System.err.println(Utils.operationTime()+": Insert positive values for price and stock");
			return null;
		}
		return new Product(model, price, stock);
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
