package com.vquochuy.observer;

import java.util.Vector;

public class Database implements Subject {

	private Vector<Observer> observers;
	private String operation;
	private String record;

	public Database() {
		observers = new Vector<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservesr() {
		for (int loopIndex = 0; loopIndex < observers.size(); loopIndex++) {
			Observer observer = observers.get(loopIndex);
			observer.update(operation, record);
		}
	}

	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		notifyObservesr();
	}

}
