package com.umfrancisco.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;

public class Server {
	
	public static void main(String[] args) {
		int port = 8000;
		try {
			HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
			server.createContext("/", new MyHandler());
			server.setExecutor(null);
			server.start();
			System.out.println("Server is running on port "+port);
		} catch (IOException e) {
			System.out.println("Error starting the server: " + e.getMessage());
		}
	}
	
	static class MyHandler implements HttpHandler {
		
		@Override
		public void handle(HttpExchange ex) throws IOException {
			String res = "hello world";
			ex.sendResponseHeaders(200, res.length());
			OutputStream os = ex.getResponseBody();
			os.write(res.getBytes());
			os.close();
		}
	}
}


