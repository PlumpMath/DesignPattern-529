package com.vquochuy.singleton;

public class Database {
	private static Database singleDatabase;
	
	private Database(){
		
	}
	
	public static Database getInstance() {
		if(singleDatabase ==null){
			singleDatabase = new Database();
		}
		return singleDatabase;
	}
	
	public String showMessage(){
		return "Connect to Database!!!";
	}
}
