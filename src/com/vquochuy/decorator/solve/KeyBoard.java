package com.vquochuy.decorator.solve;

public class KeyBoard extends ComponentDecorator{
	private Computer computer;
	@Override
	public String description() {
		return computer.description() + " KeyBoard";
	}
	@Override
	public double cost() {
		return 0.4 + computer.cost();
	}

}
