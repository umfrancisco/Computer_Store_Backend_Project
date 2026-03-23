package com.umfrancisco.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.umfrancisco.model.Product;

public class DatabaseConnection {
	private SessionFactory sf = null;
	private Transaction transaction = null;
	private Session session = null;
	
	public void open() {
		sf = new Configuration()
				.addAnnotatedClass(com.umfrancisco.model.Product.class)
				.configure()
				.buildSessionFactory();
	}
	
	public void commit(Product product) {
		session = sf.openSession();
		transaction = session.beginTransaction();
		session.persist(product);
		transaction.commit();
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
