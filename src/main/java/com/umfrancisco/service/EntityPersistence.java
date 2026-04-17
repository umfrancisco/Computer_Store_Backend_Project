package com.umfrancisco.service;

import java.util.List;

public interface EntityPersistence<T> {
	void save(T t);
	void saveAll(List<T> t);
	List<T> findAll();
	T findById(long id);
	void closeConnection();
}
