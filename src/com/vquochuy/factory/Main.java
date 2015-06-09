package com.vquochuy.factory;

public class Main {
	public static void main(String[] args) {
		FirstFactory firstFactory = new FirstFactory("SQL");
		Connection connection = firstFactory.createConnection();
		System.out.println(connection.description());

		firstFactory = new FirstFactory("Sysbase");
		connection = firstFactory.createConnection();
		System.out.println(connection.description());
	}
}
