package com.vquochuy.strategy;

public class Main {
	public static void main(String [] args){
		SpeedRacer speedRacer = new SpeedRacer();
		Helicopter helicopter = new Helicopter();
		Jet jet = new Jet();
		
		speedRacer.go();
		helicopter.go();
		jet.go();
		
		
		jet.setGoAlgorithm(new GoByDriveAlgorithm());
		jet.go();
		jet.setGoAlgorithm(new GoByFlyAlgorithm());
		jet.go();
		jet.setGoAlgorithm(new GoByFlyFastAlgorithm());
		jet.go();
	}
}
