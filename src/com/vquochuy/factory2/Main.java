package com.vquochuy.factory2;

public class Main {
	public static void main(String[] agrs) {
		SecureFactory secureFactory;
		secureFactory = new SecureFactory();
		
		Connection connection = secureFactory.createConnection("Oracle");
		System.out.println(connection.description());
	}
}
