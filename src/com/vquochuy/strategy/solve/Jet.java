package com.vquochuy.strategy.solve;

public class Jet extends Vehicle {
	public Jet() {
		setGoAlgorithm(new GoByFlyFastAlgorithm());
	}
}
