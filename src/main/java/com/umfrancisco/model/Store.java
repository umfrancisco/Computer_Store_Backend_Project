package com.umfrancisco.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
	
	public void sell(String manufacturer, String model) {
		sell(manufacturer, model, 1);
	}
	
	public void sell(String manufacturer, String model, int quantity) {
		Product p = search(manufacturer, model);
		if (p == null) {
			System.out.println(operationTime()+": Unable to find %s or %s".formatted(manufacturer, model));
		} else {
			int stock = p.getStock();
			if (stock < quantity) {
				System.out.println(operationTime()+": There is not %d %s product(s) available".formatted(quantity, model));
			} else {
				p.setStock(stock - quantity);
				delay();
				System.out.println(operationTime()+": %d %s %s sold, %d available".formatted(quantity, manufacturer, model, p.getStock()));
			}
		}
	}
	
	public void delay() {
		System.out.println(operationTime()+": Processing request...");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected String operationTime() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = dateTime.format(format);
		return formattedDate;
	}
	
	protected Product search(String manufacturer, String model) {
		for (var p : products) {
			manufacturer = manufacturer.toUpperCase();
			model = model.toUpperCase();
			if (p.getManufacturer().equals(manufacturer) && p.getModel().equals(model)) {
				return p;
			}
		}
		return null;
	}
	
	public void display() {
		logo();
		for (var product : products) {
			System.out.println(product);
			line();
		}
	}
	
	public void logo() {
		line();
		System.out.println("\n\t"+name.toUpperCase()+"\n");
		line();
	}
	
	public static void line() {
		System.out.println("*".repeat(40));
	}
}
