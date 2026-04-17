package com.umfrancisco.repository;

import java.util.List;
import org.hibernate.query.Query;

import com.umfrancisco.model.Product;

public class ProductRepository extends AbstractRepository<Product> {
	
	@Override
	public void save(Product product) {
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
	public void remove(long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
	}
}
