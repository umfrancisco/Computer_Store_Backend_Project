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
	
	public void add(Product product) {
		products.add(product);
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
