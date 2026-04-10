package com.umfrancisco.service;

import java.util.List;
import com.umfrancisco.model.Sale;
import com.umfrancisco.repository.SaleRepository;

public class SaleService {
	private SaleRepository repository = new SaleRepository();
	
	public void save(Sale sale) {
		repository.save(sale);
	}
	
	public List<Sale> findAll() {
		return repository.findAll();
	}
	
	public Sale findById(long id) {
		return repository.findById(id);
	}
	
	public void closeConnection() {
		repository.close();
	}
}
