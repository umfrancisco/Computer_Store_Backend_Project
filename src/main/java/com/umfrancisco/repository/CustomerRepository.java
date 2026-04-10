package com.umfrancisco.repository;

import java.util.List;

import org.hibernate.query.Query;
import com.umfrancisco.model.Customer;

public class CustomerRepository extends AbstractStoreRepository<Customer> {
	
	public void saveProduct(Customer customer) {
		commit(customer);
	}
	
	public List<Customer> findAll() {
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		List<Customer> list = query.getResultList();
		return list;
	}
	
	public Customer findById(long id) {
		Customer c = null;
		c = session.find(Customer.class, id);
		return c;
	}
}
