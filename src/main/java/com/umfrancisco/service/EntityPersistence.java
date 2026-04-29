package com.umfrancisco.service;

import java.util.List;

public interface EntityPersistence<T> {
	void saveOrUpdate(T t);
	void saveAll(List<T> t);
	List<T> findAll();
	T findById(long id);
	int remove(long id);
	int removeAll();
	void closeConnection();
}
