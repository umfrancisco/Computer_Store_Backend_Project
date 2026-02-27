package com.umfrancisco.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
	public static void delay() {
		System.out.println(operationTime()+": Processing request...");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String operationTime() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = dateTime.format(format);
		return formattedDate;
	}
	
	public static void logo(String name) {
		line();
		System.out.println("\n\t"+name.toUpperCase()+"\n");
		line();
	}
	
	public static void line() {
		System.out.println("*".repeat(40));
	}
}
