package com.umfrancisco.service;

import java.util.List;
import com.umfrancisco.model.Customer;
import com.umfrancisco.repository.CustomerRepository;

public class CustomerService implements PersistenceService<Customer> {
	
	private CustomerRepository repository = new CustomerRepository();

	@Override
	public void save(Customer customer) {
		repository.save(customer);
	}
	
	@Override
	public void saveAll(List<Customer> customers) {
		for (var c : customers) {
			save(c);
		}
	}
	
	@Override
	public List<Customer> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Customer findById(long id) {
		return repository.findById(id);
	}
	
	@Override
	public void closeConnection() {
		repository.close();
	}
}
