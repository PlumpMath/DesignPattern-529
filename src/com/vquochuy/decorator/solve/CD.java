package com.vquochuy.decorator.solve;

public class CD extends ComponentDecorator {
	private Computer computer;

	public CD(Computer computer) {
		this.computer = computer;
	}

	@Override
	public String description() {
		return computer.description() + " CD";
	}

}
