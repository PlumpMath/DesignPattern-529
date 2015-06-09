package com.vquochuy.strategy.solve;

public class Helicopter extends Vehicle {
	public Helicopter() {
		setGoAlgorithm(new GoByFlyAlgorithm());
	}
}
