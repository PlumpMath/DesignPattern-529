package com.vquochuy.observer3;

import java.util.Observable;
import java.util.Observer;

public class Boss implements Observer {

	public Boss() {
	}

	@Override
	public void update(Observable obs, Object obj) {
		System.out
				.println("The Boss says a " + ((Database) obs).getOperation()
						+ " operation was performed on "
						+ ((Database) obs).getRecord());
	}

}
