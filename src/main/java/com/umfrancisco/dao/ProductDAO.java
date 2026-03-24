package com.umfrancisco.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.umfrancisco.model.Product;

public class ProductDAO {
	private SessionFactory sf = null;
	private Session session = null;
	private Transaction transaction = null;
	
	public void open() {
		sf = new Configuration()
				.addAnnotatedClass(com.umfrancisco.model.Product.class)
				.configure()
				.buildSessionFactory();
		session = sf.openSession();
	}
	
	public List<Product> select() {
		List<Product> list = select("");
		return list;
	}
	
	public List<Product> select(String filter) {
		Query<Product> query = session.createQuery("from Product "+filter, Product.class);
		List<Product> list = query.getResultList();
		return list;
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
