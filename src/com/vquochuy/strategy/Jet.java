package com.vquochuy.strategy;

public class Jet extends Vehicle {
	public Jet() {
		setGoAlgorithm(new GoByFlyFastAlgorithm());
	}
}
