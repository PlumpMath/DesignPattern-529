package com.vquochuy.adapter;

public class AceClass implements AceInterface {
	private String name;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
