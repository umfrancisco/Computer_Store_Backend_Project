package com.umfrancisco.model;

import java.util.Random;

public record User(int id, String name, String email) {
	static Random random = new Random();
	
	public User(String name, String email) {
		this(random.nextInt(9999), name, email);
	}
	
	@Override
	public String toString() {
		return "%s [%s] ID=%d".formatted(name, email, id);
	}
}
