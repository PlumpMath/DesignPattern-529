package com.vquochuy.strategy;

public class SpeedRacer extends Vehicle {
	public SpeedRacer() {
		setGoAlgorithm(new GoByDriveAlgorithm());
	}
}
