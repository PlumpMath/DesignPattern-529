package com.vquochuy.decorator;

public class Disk extends ComponentDecorator{
	private Computer computer;
	
	public Disk(Computer computer) {
		this.computer = computer;
	}
	@Override
	public String description() {
		return computer.description() + " and a Disk";
	}

}
