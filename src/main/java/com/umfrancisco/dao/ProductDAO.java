package com.umfrancisco.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.umfrancisco.model.Product;

public class ProductDAO {
	private SessionFactory sf = null;
	private Transaction transaction = null;
	private Session session = null;
	
	public void open() {
		sf = new Configuration()
				.addAnnotatedClass(com.umfrancisco.model.Product.class)
				.configure()
				.buildSessionFactory();
		session = sf.openSession();
	}
	
	public Product find(long id) {
		Product p = null;
		p = session.find(Product.class, id);
		return p;
	}
	
	public void commit(Product product) {
		transaction = session.beginTransaction();
		session.persist(product);
		transaction.commit();
	}
	
	public void addProduct(long id, String model, double price, int stock, String store) {
		Product product = new Product(id, model, price, stock, store);
		commit(product);
	}
	
	public void close() {
		if (session != null) {
			session.close();
		}
		if (sf != null) {
			sf.close();
		}
	}
}
