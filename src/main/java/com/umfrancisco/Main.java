package com.umfrancisco;

import com.umfrancisco.model.Store;
import com.umfrancisco.model.Product;

public class Main {
	public static void main(String[] args) {
		Store store = new Store("Computer Tech");
		
		Product lenovo = Product.getInstance("Lenovo", "Thinkpad", 1200.0, 3);
		Product acer = Product.getInstance("Acer", "Aspire", 1000.0, 4);
		Product mac = Product.getInstance("Apple", "MacBook", 2300.0, 1);
		
		store.add(lenovo, acer, mac);
		store.display();
		
		store.sell("Lenono", "Thinkpad");
		store.sell("Lenovo", "Thinkpad", 4);
		store.sell("Lenovo", "Thinkpad", 1);
		store.sell("apple", "macbook", 1);
		store.sell("apple", "macbook", 1);
	}
}
