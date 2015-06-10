package com.vquochuy.decorator.solve;

public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer = new CD(computer);
		computer = new Mouse(computer);
		computer = new Disk(computer);
		System.out.println(computer.description());
		System.out.println(computer.cost());
		
	}
}
