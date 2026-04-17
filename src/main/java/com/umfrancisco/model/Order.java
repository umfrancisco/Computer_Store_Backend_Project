package com.umfrancisco.model;

import java.time.LocalDate;
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
	private LocalDate orderDate;
	
	public Order(long id, Customer customer, List<Product> products, LocalDate orderDate) {
		this.id = id;
		this.customer = customer;
		this.products = products;
		this.orderDate = orderDate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", products=" + products + ", orderDate=" + orderDate
				+ "]";
	}
}
