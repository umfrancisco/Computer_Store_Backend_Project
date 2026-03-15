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
	
	public Product createAndAddProduct(long id, String model, double price, int stock, Category type) {
		if (price < 0 || stock < 0) {
			throw new IllegalArgumentException(Utils.operationTime()+": Insert positive values for price and stock");
		}
		Product product = new Product(id, model, price, stock, type);
		addToStore(product);
		return product;
	}
	
	public void addToStore(Product product) {
		if (product == null) {
			System.out.println(Utils.operationTime()+": Error inserting product");
		}
		if (isNewProduct(product)) {
			products.add(product);				
		}
	}
	
	public void addToCart(Cart cart, String model) {
		addToCart(cart, model, 1);
	}
	
	public void addToCart(Cart cart, String model, int quantity) {
		Product p = search(model);
		if (p == null) {
			System.out.println(Utils.operationTime()+": Unable to find %s".formatted(model));
		} else {
			int stock = p.getStock();
			if (stock < quantity) {
				System.out.println(Utils.operationTime()+": There is not %d %s product(s) available".formatted(quantity, model));
			} else {
				p.setStock(stock - quantity);
				cart.addToCart(p, quantity);
				System.out.println(Utils.operationTime()+": %d %s added to cart, %d available".formatted(quantity, model, p.getStock()));
				remove(p);
			}
		}
	}
	
	public void remove(Product product) {
		if (product.getStock() == 0) {
			products.remove(product);
		}
	}
	
	protected boolean isNewProduct(Product p) {
		for (var product : products) {
			if (p.getId() == product.getId()) {
				System.out.println(Utils.operationTime()+": Duplicated item %s".formatted(p.getModel()));
				return false;
			}
		}
		return true;
	}
	
	protected Product search(String model) {
		for (var p : products) {
			model = model.toUpperCase();
			if (p.getModel().equals(model)) {
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
