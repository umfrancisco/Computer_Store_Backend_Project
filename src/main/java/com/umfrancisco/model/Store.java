package com.umfrancisco.model;

import java.util.LinkedHashSet;
import java.util.Set;

import com.umfrancisco.util.Utils;

public class Store {
	private final String name;
	private Set<Product> products;
	
	public Store(String name) {
		this.name = name;
		products = new LinkedHashSet<>();
	}
	
	public void add(Product... p) {
		for (var product : p) {
			if (product == null) {
				return;
			}
			products.add(product);
		}
	}
	
	public void sell(String manufacturer, String model) {
		sell(manufacturer, model, 1);
	}
	
	public void sell(String manufacturer, String model, int quantity) {
		Product p = search(manufacturer, model);
		if (p == null) {
			System.out.println(Utils.operationTime()+": Unable to find %s or %s".formatted(manufacturer, model));
		} else {
			int stock = p.getStock();
			if (stock < quantity) {
				System.out.println(Utils.operationTime()+": There is not %d %s product(s) available".formatted(quantity, model));
			} else {
				p.setStock(stock - quantity);
				Utils.delay();
				System.out.println(Utils.operationTime()+": %d %s %s sold, %d available".formatted(quantity, manufacturer, model, p.getStock()));
			}
		}
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
		Utils.logo(this.name);
		for (var product : products) {
			System.out.println(product);
			Utils.line();
		}
	}
}
