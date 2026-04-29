package com.umfrancisco.service;

import java.util.List;
import com.umfrancisco.model.Customer;
import com.umfrancisco.repository.CustomerRepository;

public class CustomerService implements EntityPersistence<Customer> {
	
	private CustomerRepository repository = new CustomerRepository();

	@Override
	public void saveOrUpdate(Customer customer) {
		repository.saveOrUpdate(customer);
	}
	
	@Override
	public void saveAll(List<Customer> customers) {
		for (var c : customers) {
			saveOrUpdate(c);
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
	public int remove(long id) {
		int count = repository.remove(id);
		return count;
	}
	
	@Override
	public int removeAll() {
		return repository.removeAll();
	}
	
	@Override
	public void closeConnection() {
		repository.close();
	}
}
