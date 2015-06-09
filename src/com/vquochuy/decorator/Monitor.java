package com.vquochuy.decorator;

public class Monitor extends ComponentDecorator {
	private Computer computer;
	public Monitor(Computer computer) {
		this.computer = computer;
	}
	@Override
	public String description() {
		return computer.description() + " and a Monitor";
	}

}
