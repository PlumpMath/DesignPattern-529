package com.vquochuy.observer2;

import java.util.*;

public class BeingWatched extends Observable {
	public void counter(int period) {
		for(;period>=0;period--){
			setChanged();
			notifyObservers(new Integer(period));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
