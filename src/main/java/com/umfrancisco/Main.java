package com.umfrancisco;

import com.umfrancisco.model.Customer;
import com.umfrancisco.model.Order;
import com.umfrancisco.model.Product;
import com.umfrancisco.service.CustomerService;
import com.umfrancisco.service.OrderService;
import com.umfrancisco.service.ProductService;

public class Main {
	
	public static void main(String[] args) {
		viewTables();
	}
	
	public static void getTotalPrice() {
		OrderService service = new OrderService();
		Order sale = service.findById(101);
		double total = sale.getTotalPrice();
		System.out.println(sale);
		System.out.println("$"+total);
	}
	
	public static void viewTables() {
		ProductService productService = new ProductService();
		CustomerService customerService = new CustomerService();
		OrderService orderService = new OrderService();
		
		var products = productService.findAll();
		var customers = customerService.findAll();
		var orders = orderService.findAll();
		
		for (var p : products) {
			System.out.println(p);			
		}
		for (var c : customers) {
			System.out.println(c);
		}
		for (var o : orders) {
			System.out.println(o);
		}
		
		productService.closeConnection();
		customerService.closeConnection();
	}
	
	public static void addRandomOrder() {
		CustomerService cs = new CustomerService();
		Customer c = cs.findById(1);
		
		ProductService ps = new ProductService();
		Product p1 = ps.findById(3);
		Product p2 = ps.findById(5);
		
		Order order = new Order(101, c, p1, p2);
		
		OrderService service = new OrderService();
		service.save(order);
		
		var list = service.findAll();
		for (var item : list) {
			System.out.println(item);
		}
	}
	
	public static void addRandomCustomers() {
		Customer[] customers = {
				new Customer(1, "Ann", "ann@email.com"),
				new Customer(2, "Bob", "bob@email.com"),
				new Customer(3, "Carole", "carole@email.com"),
				new Customer(4, "Dave", "dave@email.com"),
				new Customer(5, "Ed", "ed@email.com")
		};
		int size = customers.length;
		
		CustomerService service = new CustomerService();
		
		for (int i = 0; i < size; i++) {
			service.save(customers[i]);
		}
		
		var list = service.findAll();
		for (var item : list) {
			System.out.println(item);
		}
		service.closeConnection();
	}
	
	public static void addRandomProducts() {
		Product[] products = {
				new Product(1, "Dell Inspiron 15", 2999.17),
				new Product(2, "HP Pavilion 14", 3699.38),
				new Product(3, "Lenovo IdeaPad 3", 2924.86),
				new Product(4, "Lenovo Yoga Slim 7i", 2683.12),
				new Product(5, "Asus Vivobook S15", 8369.07)
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
