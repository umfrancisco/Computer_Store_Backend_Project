package com.umfrancisco.model;

import java.util.Random;

public class Product {
	private final long id;
	private final String name;
	private final double price;
	private int stock;
	private Random random = new Random();
	
	public Product(String name, double price, int stock) {
		id = random.nextLong(1000);
		this.name = name;
		this.price = price;
		if (stock < 0) {
			System.err.println("Can not register negative numbers for stock");
			this.stock = 0;
		} else {
			this.stock = stock;
		}
	}
	
	@Override
	public String toString() {
		String formattedOutput = """
				Name: %s
				Code: %d
				Price: $%.2f
				%s""".formatted(name, id, price, (stock > 0) ? "" : "SOLD OUT\n");
		return formattedOutput;
	}
}
