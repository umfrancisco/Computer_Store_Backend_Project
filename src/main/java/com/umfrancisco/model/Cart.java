package com.umfrancisco.model;

import java.util.ArrayList;
import java.util.List;
import com.umfrancisco.util.Utils;

public class Cart {
	private String username;
	private List<Product> cart;
	
	public Cart(String username) {
		this.username = username;
		cart = new ArrayList<>();
	}
	
	protected void addToCart(Product product, int quantity) {
		for (int i = 0; i < quantity; i++) {
			cart.add(product);
			System.out.println(Utils.operationTime()+": %s added to %s's cart".formatted(product.getModel(), username));
		}
	}
	
	public void showCart() {
		Utils.line();
		System.out.println("Customer Payout: %s\n".toUpperCase().formatted(username));
		double total = 0;
		for (var p : cart) {
			System.out.println(p);
			total += p.getPrice();
		}
		System.out.println("Total: $"+total);
	}
}
