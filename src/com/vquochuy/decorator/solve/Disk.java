package com.vquochuy.decorator.solve;

public class Disk extends ComponentDecorator {
	private Computer computer;

	public Disk(Computer computer) {
		this.computer = computer;
	}

	@Override
	public String description() {
		return computer.description()+" Disk";
	}

	@Override
	public double cost() {
		return 1.0 + computer.cost();
	}

}
