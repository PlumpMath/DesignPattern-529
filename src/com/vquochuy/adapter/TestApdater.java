package com.vquochuy.adapter;

public class TestApdater {
	public static void main(String agrs[]) {
		AceClass aceClass = new AceClass();
		aceClass.setName("Huy Vu");
		AceToAcmeApdater adapter = new AceToAcmeApdater(aceClass);
		System.out.println("First Name: "+adapter.getFirstName());
		System.out.println("Last Name: "+adapter.getLastName());
	}
}
