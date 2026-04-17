package com.umfrancisco.service;

import java.util.List;
import com.umfrancisco.model.Order;
import com.umfrancisco.repository.OrderRepository;

public class OrderService implements PersistenceService<Order> {
	
	private OrderRepository repository = new OrderRepository();
	
	@Override
	public void save(Order order) {
		repository.save(order);
	}
	
	@Override
	public void saveAll(List<Order> orders) {
		for (var o : orders) {
			save(o);
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
	public void closeConnection() {
		repository.close();
	}
}
