package com.umfrancisco.service;

import java.util.List;
import com.umfrancisco.model.Order;
import com.umfrancisco.repository.OrderRepository;

public class OrderService {
	
	private OrderRepository repository = new OrderRepository();
	
	public void save(Order order) {
		repository.save(order);
	}
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(long id) {
		return repository.findById(id);
	}
	
	public void closeConnection() {
		repository.close();
	}
}
