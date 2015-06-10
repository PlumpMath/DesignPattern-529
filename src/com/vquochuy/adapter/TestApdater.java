package com.vquochuy.adapter;

public class TestApdater {
	public static void main(String agrs[]) {
		AceClass aceClass = new AceClass();
		AcmeClass acmeClass = new AcmeClass();
		
		aceClass.setName("Oanh Duong");
		System.out.println("Full Name: " + aceClass.getName());
		AceToAcmeApdater adapter = new AceToAcmeApdater(aceClass);
		
		System.out.println("First Name: "+adapter.getFirstName());
		System.out.println("Last Name: "+adapter.getLastName());
	}
}
