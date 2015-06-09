package com.vquochuy.strategy.solve;

public class Main {
	public static void main(String [] agrs){
		StreetRace streetRace = new StreetRace();
		Helicopter helicopter = new Helicopter();
		Jet jet = new Jet();
		
		streetRace.go();
		helicopter.go();
		jet.go();
	}
}
