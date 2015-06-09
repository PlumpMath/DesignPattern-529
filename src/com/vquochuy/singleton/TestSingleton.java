package com.vquochuy.singleton;

public class TestSingleton {
	public static void main(String[] agrs) {
		Database database;
		database = Database.getInstance();
		
		System.out.println(database.showMessage());
		
		database = Database.getInstance();
		System.out.println(database.showMessage());
		
	}
}
