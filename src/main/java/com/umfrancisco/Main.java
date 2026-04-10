package com.umfrancisco;

import java.util.Random;

import com.umfrancisco.model.Product;
import com.umfrancisco.service.ProductService;

public class Main {
	
	public static void main(String[] args) {
		products();
	}
	
	public static void products() {
		Random random = new Random();
		
		Product[] products = {
				new Product(random.nextLong(1000), "Dell Inspiron 15", 2999.17, 65, "Store 1"),
				new Product(random.nextLong(1000), "HP Pavilion 14", 3699.38, 35, "Store 2"),
				new Product(random.nextLong(1000), "Lenovo IdeaPad 3", 2924.86, 23, "Store 1"),
				new Product(random.nextLong(1000), "Lenovo Yoga Slim 7i", 2683.12, 12, "Store 3"),
				new Product(random.nextLong(1000), "Asus Vivobook S15", 8369.07, 29, "Store 2")
		};
		int size = products.length;
		
		ProductService service = new ProductService();
		
		for (int i = 0; i < size; i++) {
			service.save(products[i]);
		}
		
		var list = service.findAll();
		for (var item : list) {
			System.out.println(item);
		}
		
		service.closeConnection();
	}
}
