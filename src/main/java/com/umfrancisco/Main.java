package com.umfrancisco;

import com.umfrancisco.model.Store;
import com.umfrancisco.model.Cart;
import com.umfrancisco.model.Product;

public class Main {
	public static void main(String[] args) {
		Store store = new Store("Computer Tech");
		Cart cart = new Cart("Francisco");
		
		Product lenovo, acer, mac, iphone, samsung;
		
		lenovo = Product.getInstance("Lenovo", "Thinkpad", 1200.0, 3);
		acer = Product.getInstance("Acer", "Aspire", 1000.0, 4);
		mac = Product.getInstance("Apple", "MacBook", 2300.0, 1);
		iphone= Product.getInstance("Apple", "17 Pro", 800, 3);
		samsung = Product.getInstance("Samsung", "Galaxy S", 700, 2);
		
		store.addToStore(lenovo, acer, mac, iphone, samsung);
		store.display();
		
		store.addToCart(cart, "Lenono", "Thinkpad");
		store.addToCart(cart, "Lenovo", "Thinkpad", 4);
		store.addToCart(cart, "Lenovo", "Thinkpad", 2);
		store.addToCart(cart, "apple", "macbook", 1);
		store.addToCart(cart, "apple", "macbook", 1);
		store.addToCart(cart, "samsung", "galaxy s", 1);
		
		cart.showCart();
		store.display();
	}
}
