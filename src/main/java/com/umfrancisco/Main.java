package com.umfrancisco;

import java.time.LocalDate;
import java.util.List;
import com.umfrancisco.model.Customer;
import com.umfrancisco.model.Product;
import com.umfrancisco.service.ProductService;

public class Main {
	
	public static void main(String[] args) {
		
		List<Product> products = List.of(
		    new Product(1L, "iPhone 14", "Apple smartphone with A15 chip", 799.99, 50, LocalDate.of(2022, 9, 16)),
		    new Product(2L, "Galaxy S23", "Samsung flagship Android phone", 699.99, 40, LocalDate.of(2023, 2, 1)),
		    new Product(3L, "MacBook Pro M2", "Apple laptop with M2 chip", 1299.99, 25, LocalDate.of(2022, 6, 24)),
		    new Product(4L, "Dell XPS 13", "Compact ultrabook laptop", 999.99, 30, LocalDate.of(2021, 11, 10)),
		    new Product(5L, "Sony WH-1000XM5", "Noise cancelling headphones", 349.99, 100, LocalDate.of(2022, 5, 20)),
		    new Product(6L, "iPad Air", "Apple tablet with M1 chip", 599.99, 45, LocalDate.of(2022, 3, 18)),
		    new Product(7L, "Amazon Echo Dot", "Smart speaker with Alexa", 49.99, 200, LocalDate.of(2021, 10, 5)),
		    new Product(8L, "GoPro Hero 11", "Action camera 5.3K video", 399.99, 60, LocalDate.of(2022, 9, 14)),
		    new Product(9L, "Nintendo Switch", "Hybrid gaming console", 299.99, 80, LocalDate.of(2017, 3, 3)),
		    new Product(10L, "Logitech MX Master 3", "Advanced wireless mouse", 99.99, 150, LocalDate.of(2019, 9, 4))
		);
		
		List<Customer> customers = List.of(
		    new Customer(1L, "Lucas", "Silva", "lucas.silva@email.com", LocalDate.of(1995, 5, 12), "Rua das Flores, 123", "São Paulo", "Brazil"),
		    new Customer(2L, "Maria", "Oliveira", "maria.oliveira@email.com", LocalDate.of(1990, 11, 25), "Av. Paulista, 1000", "São Paulo", "Brazil"),
		    new Customer(3L, "John", "Smith", "john.smith@email.com", LocalDate.of(1985, 3, 8), "742 Evergreen Terrace", "Springfield", "USA"),
		    new Customer(4L, "Emma", "Johnson", "emma.j@email.com", LocalDate.of(1992, 7, 30), "221B Baker Street", "London", "UK"),
		    new Customer(5L, "Carlos", "Souza", "carlos.souza@email.com", LocalDate.of(1988, 1, 15), "Rua A, 45", "Rio de Janeiro", "Brazil"),
		    new Customer(6L, "Ana", "Costa", "ana.costa@email.com", LocalDate.of(1997, 4, 22), "Rua B, 78", "Belo Horizonte", "Brazil"),
		    new Customer(7L, "Liam", "Brown", "liam.brown@email.com", LocalDate.of(1993, 12, 5), "10 Downing St", "London", "UK"),
		    new Customer(8L, "Olivia", "Davis", "olivia.d@email.com", LocalDate.of(1996, 8, 18), "5th Avenue", "New York", "USA"),
		    new Customer(9L, "Noah", "Wilson", "noah.w@email.com", LocalDate.of(1989, 10, 9), "Sunset Blvd", "Los Angeles", "USA"),
		    new Customer(10L, "Sofia", "Martins", "sofia.m@email.com", LocalDate.of(1994, 2, 27), "Rua Central, 200", "Curitiba", "Brazil")
		);
		
	}
}
