package com.umfrancisco.service;

import java.util.List;

import com.umfrancisco.model.Product;
import com.umfrancisco.repository.ProductRepository;

public class ProductService {
	
	private ProductRepository repository = new ProductRepository();
	
	public void save(Product product) {
		repository.save(product);
	}
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(long id) {
		return repository.findById(id);
	}
	
	public void closeConnection() {
		repository.close();
	}
}
