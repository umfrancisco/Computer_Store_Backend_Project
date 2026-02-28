package com.umfrancisco.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
	
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
