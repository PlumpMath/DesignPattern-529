package com.vquochuy.strategy.solve;

public class MainJet {
public static void main(String [] arg){
	Jet jet = new Jet();
	
	jet.setGoAlgorithm(new GoByDriveAlgorithm());
	jet.go();
	
	jet.setGoAlgorithm(new GoByFlyAlgorithm());
	jet.go();
	
	jet.setGoAlgorithm(new GoByFlyFastAlgorithm());
	jet.go();
}
}
