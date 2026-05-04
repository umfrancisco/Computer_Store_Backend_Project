package com.umfrancisco;

import java.util.List;
import com.umfrancisco.model.Customer;
import com.umfrancisco.model.Data;
import com.umfrancisco.model.Product;
import com.umfrancisco.service.CustomerService;
import com.umfrancisco.service.ProductService;

public class Application {
	
	public static void main(String[] args) {
		
		List<Product> products = Data.products();
		List<Customer> customers = Data.customers();
		
		var productService = new ProductService();
		var customerService = new CustomerService();
		
		productService.saveAll(products);
		customerService.saveAll(customers);
		
//		int productsRemoved = productService.removeAll();
//		int customersRemoved = customerService.removeAll();
//		System.out.println("productsRemoved="+productsRemoved);
//		System.out.println("customersRemoved="+customersRemoved);
		
		
		var listProducts = productService.findAll();
		for (var p : listProducts) {
			System.out.println(p);
		}
		
		var listCustomers = customerService.findAll();
		for (var c : listCustomers) {
			System.out.println(c);
		}
		
		productService.closeConnection();
		customerService.closeConnection();
	}
}
