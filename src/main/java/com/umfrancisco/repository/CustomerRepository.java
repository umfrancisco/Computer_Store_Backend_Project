package com.umfrancisco.repository;

import java.util.List;
import org.hibernate.query.Query;
import com.umfrancisco.model.Customer;

public class CustomerRepository extends AbstractRepository<Customer> {
	
	@Override
	public void saveOrUpdate(Customer customer) {
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
	public int remove(long id) {
		int count = 0;
		Customer customer = findById(id);
		if (customer != null) {
			beginTransaction();
			session.remove(customer);
			commit();
			count++;
		}
		return count;
	}

	@Override
	public int removeAll() {
		int count = 0;
		List<Customer> list = findAll();
		for (var c : list) {
			int removed = remove(c.getId());
			count += removed;
		}
		return count;
	}
}
