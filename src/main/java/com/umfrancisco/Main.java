package com.umfrancisco;

import com.umfrancisco.dao.ProductDAO;

public class Main {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		dao.open();
//		dao.addProduct(102, "Lenovo Thinkpad", 1200.0, 6, "My Computer Store");
		var p = dao.find(101);
		System.out.println(p);
		dao.close();
	}
}
