package com.umfrancisco.service;

import java.util.List;

public interface PersistenceService<T> {
	
	public void save(T t);
	public void saveAll(List<T> t);
	public List<T> findAll();
	public T findById(long id);
	public void closeConnection();
}
