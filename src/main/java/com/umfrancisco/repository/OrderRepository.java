package com.umfrancisco.repository;

import java.util.List;
import org.hibernate.query.Query;
import com.umfrancisco.model.Order;

public class OrderRepository extends AbstractRepository<Order> {

	@Override
	public void saveOrUpdate(Order order) {
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
	public int remove(long id) {
		int count = 0;
		Order order = findById(id);
		if (order != null) {
			beginTransaction();
			session.remove(order);
			commit();
			count++;
		}
		return count;
	}

	@Override
	public int removeAll() {
		int count = 0;
		List<Order> list = findAll();
		for (var o : list) {
			int removed = remove(o.getId());
			count += removed;
		}
		return count;
	}
	
}
