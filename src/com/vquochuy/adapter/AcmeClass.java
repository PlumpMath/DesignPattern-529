package com.vquochuy.adapter;

public class AcmeClass implements AcmeInterface {
	private String firstName;
	private String lastName;

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

	public AcmeClass(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public AcmeClass() {
	}

}
