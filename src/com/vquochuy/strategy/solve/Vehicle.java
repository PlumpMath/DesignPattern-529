package com.vquochuy.strategy.solve;

public abstract class Vehicle {
	private GoAlgorithm goAlgorithm;
	
	public void setGoAlgorithm(GoAlgorithm goAlgorithm){
		this.goAlgorithm = goAlgorithm;
	}
	public void go(){
		goAlgorithm.go();
	}
}
