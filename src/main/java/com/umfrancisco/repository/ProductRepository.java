package com.umfrancisco.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.umfrancisco.model.Product;

public class ProductRepository extends AbstractStoreRepository<Product> {
	
	public void saveProduct(Product product) {
		commit(product);
	}
	
	public List<Product> findAll() {
		Query<Product> query = session.createQuery("from Product", Product.class);
		List<Product> list = query.getResultList();
		return list;
	}
	
	public Product findById(long id) {
		Product p = null;
		p = session.find(Product.class, id);
		return p;
	}
}
