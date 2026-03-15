package com.umfrancisco;

import com.umfrancisco.model.Store;
import com.umfrancisco.model.Cart;
import com.umfrancisco.model.Product;
import com.umfrancisco.model.Category;

public class Main {
	public static void main(String[] args) {
		Store store = new Store("Computer Tech");
		Cart cart = new Cart("Francisco");
		
		store.createAndAddProduct(100, "Lenovo Thinkpad", 1200.0, 3, Category.NOTEBOOK);
		store.createAndAddProduct(100, "Lenovo Thinkpad", 1200.0, 3, Category.NOTEBOOK);
		store.createAndAddProduct(200, "Acer Aspire", 1000.0, 4, Category.NOTEBOOK);
		store.createAndAddProduct(300, "Apple MacBook", 2300.0, 1, Category.NOTEBOOK);
		
		store.display();
		
		store.addToCart(cart, "Lenono Thinkpad");
		store.addToCart(cart, "Lenovo Thinkpad", 4);
		store.addToCart(cart, "Lenovo Thinkpad", 2);
		store.addToCart(cart, "apple macbook", 1);
		store.addToCart(cart, "apple macbook", 1);
		
		cart.showCart();
		store.display();
	}
}
