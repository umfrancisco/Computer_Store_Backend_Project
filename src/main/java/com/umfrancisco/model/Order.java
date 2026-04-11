package com.umfrancisco.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="order_tb")
public class Order {
	
	@Id
	private long id;
	@ManyToOne
	private Customer customer;
	@ManyToMany
	private List<Product> products;
	
	public Order() {
		
	}
	
	public Order(long id, Customer customer, Product... products) {
		this.id = id;
		this.customer = customer;
		this.products = new ArrayList<>(List.of(products));
	}
	
	public double getTotalPrice() {
		double sum = 0;
		for (var p : products) {
			double price = p.getPrice();
			if (price > 0) {
				sum += price;
			}
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Customer: %s %s".formatted(customer, products);
	}
}
