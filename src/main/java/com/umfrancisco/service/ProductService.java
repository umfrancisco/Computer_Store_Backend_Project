package com.umfrancisco.service;

import java.util.List;
import com.umfrancisco.model.Product;
import com.umfrancisco.repository.ProductRepository;

public class ProductService implements EntityPersistence<Product> {
	
	private ProductRepository repository = new ProductRepository();
	
	@Override
	public void save(Product product) {
		repository.save(product);
	}
	
	@Override
	public void saveAll(List<Product> products) {
		for (var p : products) {
			save(p);
		}
	}
	
	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Product findById(long id) {
		return repository.findById(id);
	}
	
	@Override
	public void closeConnection() {
		repository.close();
	}
}
