package com.umfrancisco.service;

import java.util.List;
import com.umfrancisco.model.Order;
import com.umfrancisco.repository.OrderRepository;

public class OrderService implements EntityPersistence<Order> {
	
	private OrderRepository repository = new OrderRepository();
	
	@Override
	public void saveOrUpdate(Order order) {
		repository.saveOrUpdate(order);
	}
	
	@Override
	public void saveAll(List<Order> orders) {
		for (var o : orders) {
			saveOrUpdate(o);
		}
	}
	
	@Override
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Order findById(long id) {
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
