package com.vquochuy.strategy.solve;

public class StreetRace extends Vehicle {
	public StreetRace() {
		setGoAlgorithm(new GoByDriveAlgorithm());
	}
}
