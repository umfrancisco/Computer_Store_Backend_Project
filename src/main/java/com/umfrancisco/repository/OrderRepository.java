package com.umfrancisco.repository;

import java.util.List;
import org.hibernate.query.Query;
import com.umfrancisco.model.Order;

public class OrderRepository extends AbstractStoreRepository<Order> {

	@Override
	public void save(Order order) {
		commit(order);
	}

	@Override
	public List<Order> findAll() {
		Query<Order> query = session.createQuery("from Order", Order.class);
		List<Order> list = query.getResultList();
		return list;
	}

	@Override
	public Order findById(long id) {
		Order o = null;
		o = session.find(Order.class, id);
		return o;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
	}
	
}
