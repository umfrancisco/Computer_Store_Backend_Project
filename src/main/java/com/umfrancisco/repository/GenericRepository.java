package com.umfrancisco.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.umfrancisco.model.Product;

public class GenericRepository<T> {
	
	private SessionFactory sf = new Configuration()
			.addAnnotatedClass(com.umfrancisco.model.Product.class)
			.configure()
			.buildSessionFactory();
	private Session session = sf.openSession();
	private Transaction transaction = null;
	
	public void close() {
		if (session != null) {
			session.close();
		}
		if (sf != null) {
			sf.close();
		}
	}
	
	public void commit(Product product) {
		transaction = session.beginTransaction();
		session.persist(product);
		transaction.commit();
	}
	
	public void saveProduct(Product product) {
		commit(product);
	}
	
	public List<Product> findAll() {
		Query<Product> query = session.createQuery("from Product ", Product.class);
		List<Product> list = query.getResultList();
		return list;
	}
	
	public Product findById(long id) {
		Product p = null;
		p = session.find(Product.class, id);
		return p;
	}
}
