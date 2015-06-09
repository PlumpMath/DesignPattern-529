package com.vquochuy.observer2;

import java.util.*;

public class Watcher implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("update() called, count is "
				+ ((Integer) arg).intValue());

	}

}
