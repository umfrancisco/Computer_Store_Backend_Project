package com.umfrancisco.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_tb")
public class Product {
	
	@Id
	private long id;
	private String model;
	private String description;
	private double price;
	private int stock;
	private LocalDate releaseDate;
	
	public Product() {
		
	}
	
	public Product(long id, String model, String description, double price, int stock, LocalDate releaseDate) {
		this.id = id;
		this.model = model;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.releaseDate = releaseDate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", model=" + model + ", description=" + description + ", price=" + price
				+ ", stock=" + stock + ", releaseDate=" + releaseDate + "]";
	}
}
