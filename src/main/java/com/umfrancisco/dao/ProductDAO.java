package com.umfrancisco.dao;

import com.umfrancisco.model.Product;
import com.umfrancisco.util.DatabaseConnection;

public class ProductDAO {
	
	private DatabaseConnection database = null;
	
	public void createConnection() {
		if (database == null) {
			database = new DatabaseConnection();
			database.open();
		}
	}
	
	public void addProduct(long id, String model, double price, int stock, String store) {
		Product product = new Product(id, model, price, stock, store);
		if (database != null) {
			database.commit(product);
		}
	}
	
	public void closeConnection() {
		if (database != null) {
			database.close();
		}
	}
}
