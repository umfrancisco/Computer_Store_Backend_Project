package com.umfrancisco.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
public class Sale {
	
	@Id
	private long id;
	@ManyToOne
	private Customer customer;
	@ManyToMany
	private List<Product> products;
	
	public Sale() {
		
	}
	
	public Sale(long id, Customer customer, Product... products) {
		this.id = id;
		this.customer = customer;
		this.products = new ArrayList<>(List.of(products));
	}

	@Override
	public String toString() {
		return "Sale [id=" + id + ", customer=" + customer + ", products=" + products + "]";
	}
}
