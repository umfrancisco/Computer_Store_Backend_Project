package com.umfrancisco;

import com.umfrancisco.dao.ProductDAO;

public class Main {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		dao.open();
		
		dao.addProduct(100, "Dell Inspiron 15", 2999.17, 65, "Store 1");
		dao.addProduct(101, "HP Pavilion 14", 3699.38, 35, "Store 2");
		dao.addProduct(102, "Lenovo IdeaPad 3", 2924.86, 23, "Store 1");
		dao.addProduct(103, "Lenovo Yoga Slim 7i", 2683.12, 12, "Store 3");
		dao.addProduct(104, "Asus Vivobook S15", 8369.07, 29, "Store 2");
		
		var list = dao.select();
		System.out.println("-".repeat(50));
		
		for (var l : list) {
			System.out.println(l);
		}
		
		dao.close();
	}
}
