package com.umfrancisco.repository;

import java.util.List;

import org.hibernate.query.Query;
import com.umfrancisco.model.Customer;

public class CustomerRepository extends AbstractStoreRepository<Customer> {
	
	@Override
	public void save(Customer customer) {
		commit(customer);
	}
	
	@Override
	public List<Customer> findAll() {
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		List<Customer> list = query.getResultList();
		return list;
	}
	
	@Override
	public Customer findById(long id) {
		Customer c = null;
		c = session.find(Customer.class, id);
		return c;
	}

	@Override
	void remove(long id) {
		// TODO Auto-generated method stub
	}

	@Override
	void removeAll() {
		// TODO Auto-generated method stub
	}
}
