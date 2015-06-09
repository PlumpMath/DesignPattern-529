package com.vquochuy.adapter;

public class AceToAcmeApdater implements AcmeInterface {
	AceClass aceClass;
	private String firstName;
	private String lastName;
	
	public AceToAcmeApdater(AceClass aceClass) {
		this.aceClass = aceClass;
		firstName = aceClass.getName().split(" ")[0];
		lastName = aceClass.getName().split(" ")[1];
		
	}
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

}
