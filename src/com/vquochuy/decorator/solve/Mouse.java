package com.vquochuy.decorator.solve;

public class Mouse extends ComponentDecorator {
	private Computer computer;
	public Mouse(Computer computer) {
		this.computer = computer;
	}
	@Override
	public String description() {
		return computer.description() +" Mouse";
	}

	@Override
	public double cost() {
		return 0.1 + computer.cost() ;
	}

}
