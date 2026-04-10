package com.umfrancisco.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int id;
	private String name;
	private String email;
	private List<Product> products;
	
	public Customer() {
		
	}
	
	public Customer(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
		products = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Product> getProducts() {
		return products;
	}
	
	public void add(Product product) {
		products.add(product);
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", products=" + products + "]";
	}
}
