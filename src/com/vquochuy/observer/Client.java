package com.vquochuy.observer;

public class Client implements Observer {
	public Client() {
	}

	@Override
	public void update(String operation, String record) {
		System.out.println("The Client say a " + operation
				+ " opertation was performed on " + record);
	}

}
