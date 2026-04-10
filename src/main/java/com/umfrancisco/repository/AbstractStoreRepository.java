package com.umfrancisco.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public abstract class AbstractStoreRepository<T> {
	
	protected SessionFactory sf = new Configuration()
			.addAnnotatedClass(com.umfrancisco.model.Product.class)
			.configure()
			.buildSessionFactory();
	protected Session session = sf.openSession();
	protected Transaction transaction = null;
	
	public void close() {
		if (session != null) {
			session.close();
		}
		if (sf != null) {
			sf.close();
		}
	}
	
	public void commit(T t) {
		transaction = session.beginTransaction();
		session.persist(t);
		transaction.commit();
	}
}
