package com.vquochuy.strategy;

public class Helicopter extends Vehicle {
	public Helicopter() {
		setGoAlgorithm(new GoByFlyAlgorithm());
	}
}
