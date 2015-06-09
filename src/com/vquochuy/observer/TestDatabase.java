package com.vquochuy.observer;

public class TestDatabase {
public static void main(String [] args){
	Database database = new Database();
	Archiver archiver = new Archiver();
	Client client = new Client();
	Boss boss = new Boss();
	
	database.registerObserver(archiver);
	database.registerObserver(client);
	database.registerObserver(boss);
	database.removeObserver(boss);
	
	
	database.editRecord("delete", "record 1");
	database.editRecord("update", "record 2");
}
}
