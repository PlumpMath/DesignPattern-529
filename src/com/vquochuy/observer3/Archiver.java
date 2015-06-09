package com.vquochuy.observer3;

import java.util.Observable;
import java.util.Observer;

public class Archiver implements Observer {

	
	public Archiver() {
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("The Archiver says a "
				+ ((Database) o).getOperation()
				+ " operation was performed on " + ((Database) o).getRecord());
	}

}
