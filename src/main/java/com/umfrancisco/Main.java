package com.umfrancisco;

import com.umfrancisco.model.Store;
import com.umfrancisco.model.Product;

public class Main {
	public static void main(String[] args) {
		Store store = new Store("Computer Tech");
		Product lenovo = new Product("Lenovo Thinkpad e420", 1200.0, 3);
		Product acer = new Product("Acer Aspire A350", 1000.0, 4);
		Product mac = new Product("Apple MacBook 120b", 2300.0, 0);
		
		store.add(lenovo, acer, mac);
		store.displayProducts();
	}
}
