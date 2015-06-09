package com.vquochuy.factory;

public class FirstFactory {
	protected String type;

	public FirstFactory(String type) {
		this.type = type;
	}

	public Connection createConnection() {
		if (type.equals("SQL")) {
			return new SqlConnection();
		} 
		else if(type.equals("Sysbase")){
			return new SysbaseConnection();
		}
		else {
			return new OracleConnection();
		}
		

	}
}
