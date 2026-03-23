package com.umfrancisco;

import com.umfrancisco.dao.ProductDAO;

public class Main {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		dao.open();
		dao.addProduct(100, "Lenovo Thinkpad", 1200.0, 6, "Store A");
		dao.addProduct(101, "Asus Vivobook", 1300.0, 4, "Store B");
		dao.addProduct(102, "HP ProBook", 1100.0, 7, "Store A");
		var p = dao.find(102);
		System.out.println(p);
		dao.close();
	}
}
