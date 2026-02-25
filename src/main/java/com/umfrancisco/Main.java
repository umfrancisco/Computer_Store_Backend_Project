package com.umfrancisco;

import com.umfrancisco.model.Store;
import com.umfrancisco.model.Product;

public class Main {
	public static void main(String[] args) {
		Store store = new Store("Computer Tech");
		Product lenovo = new Product("Thinkpad e420", 1200.0, 0);
		Product acer = new Product("Aspire A350", 1000.0, 0);
		
		store.add(lenovo, acer);
		store.displayProducts();
	}
}
