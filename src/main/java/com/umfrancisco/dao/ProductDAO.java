package com.umfrancisco.dao;

import com.umfrancisco.model.Product;
import com.umfrancisco.util.DatabaseConnection;

public class ProductDAO {
	
	public void createAndAdd(long id, String model, double price, int stock) {
		Product product = new Product(id, model, price, stock);
		DatabaseConnection db = new DatabaseConnection();
		db.open();
		db.commit(product);
		db.close();
	}
}
