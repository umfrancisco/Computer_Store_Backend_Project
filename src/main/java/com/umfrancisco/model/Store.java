package com.umfrancisco.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Store {
	private final String name;
	private Set<Product> products;
	
	public Store(String name) {
		this.name = name;
		products = new LinkedHashSet<>();
	}
	
	public void add(Product... p) {
		for (var product : p) {
			products.add(product);
		}
	}
	
	public void sell(String name) {
		sell(name, 1);
	}
	
	public void sell(String name, int quantity) {
		for (var product : products) {
			boolean isFound = product.getName().contains(name.toUpperCase());
			int stock = product.getStock();
			if (isFound && stock - quantity >= 0) {
				System.out.printf("# %d of %s was found and sold\n", stock, product.getName());
				product.setStock(stock - quantity);
				System.out.printf("# %d of %s remaining\n", product.getStock(), product.getName());
			} 
			if (isFound && stock - quantity < 0) {
				System.out.printf("# Can not proceed, only %d of %s remaining\n".formatted(product.getStock(), product.getName()));
			}
		}
		System.out.println();
	}
	
	public void displayProducts() {
		System.out.println(name);
		line();
		for (var product : products) {
			System.out.println(product);
			line();
		}
	}
	
	public static void line() {
		System.out.println("*".repeat(30));
	}
}
