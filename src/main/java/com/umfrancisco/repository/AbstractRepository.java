package com.umfrancisco.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public abstract class AbstractRepository<T> {
	
	protected SessionFactory sf = new Configuration()
			.addAnnotatedClass(com.umfrancisco.model.Product.class)
			.addAnnotatedClass(com.umfrancisco.model.Customer.class)
			.addAnnotatedClass(com.umfrancisco.model.Order.class)
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
	
	public void beginTransaction() {
		transaction = session.beginTransaction();
	}
	
	public void commit() {
		transaction.commit();
	}
	
	public void commit(T t) {
		beginTransaction();
		session.persist(t);
		commit();
	}
	
	public abstract void saveOrUpdate(T t);
	public abstract List<T> findAll();
	public abstract T findById(long id);
	public abstract int remove(long id);
	public abstract int removeAll();
}
