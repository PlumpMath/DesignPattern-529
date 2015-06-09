package com.vquochuy.observer;

public class Boss implements Observer {
	public Boss() {
	}

	@Override
	public void update(String operation, String record) {
		System.out.println("The Boss say a " + operation
				+ " operation was performed on " + record);
	}

}
