package com.umfrancisco;

import com.umfrancisco.dao.ProductDAO;

public class Main {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		dao.createAndAdd(100, "Lenovo Ideapad", 1200.00, 5);
	}
}
