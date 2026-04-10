package com.umfrancisco.service;

import java.util.List;
import com.umfrancisco.model.Customer;
import com.umfrancisco.repository.CustomerRepository;

public class CustomerService {
	
	private CustomerRepository repository = new CustomerRepository();

	public void save(Customer customer) {
		repository.save(customer);
	}
	
	public List<Customer> findAll() {
		return repository.findAll();
	}
	
	public Customer findById(long id) {
		return repository.findById(id);
	}
	
	public void closeConnection() {
		repository.close();
	}
}
