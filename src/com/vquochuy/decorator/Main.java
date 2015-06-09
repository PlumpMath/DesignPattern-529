package com.vquochuy.decorator;

public class Main {
	public static void main(String agrs[]) {
		Computer computer = new Computer();
		System.out.println(computer.description());
		
		computer = new Disk(computer);
		System.out.println(computer.description());
	}
}
