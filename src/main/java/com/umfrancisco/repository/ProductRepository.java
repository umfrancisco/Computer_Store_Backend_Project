package com.umfrancisco.repository;

import java.util.List;
import org.hibernate.query.Query;

import com.umfrancisco.model.Product;

public class ProductRepository extends AbstractRepository<Product> {
	
	@Override
	public void saveOrUpdate(Product product) {
		commit(product);
	}
	
	@Override
	public List<Product> findAll() {
		Query<Product> query = session.createQuery("from Product", Product.class);
		List<Product> list = query.getResultList();
		return list;
	}
	
	@Override
	public Product findById(long id) {
		Product p = null;
		p = session.find(Product.class, id);
		return p;
	}

	@Override
	public int remove(long id) {
		int count = 0;
		Product product = findById(id);
		if (product != null) {
			beginTransaction();
			session.remove(product);
			commit();
			count++;
		}
		return count;
	}

	@Override
	public int removeAll() {
		int count = 0;
		List<Product> list = findAll();
		for (var p : list) {
			int removed = remove(p.getId());
			count += removed;
		}
		return count;
	}
}
