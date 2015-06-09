package com.vquochuy.observer3;

public class TestObservable {
	public static void main(String[] args) {
		Database database = new Database();
		
		Archiver archiver = new Archiver();
		
		Boss boss = new Boss();
		
		Client client = new Client();
		
		database.addObserver(archiver);
		database.addObserver(boss);
		database.addObserver(client);
		
		database.deleteObserver(client);
		
		database.editRecord("delete", "01");
		
		System.out.println("A number register of server: "+database.countObservers());
	}
}
