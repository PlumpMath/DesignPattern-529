package com.vquochuy.factory2;

public class SecureFactory extends ConnectionFactory {

	@Override
	public Connection createConnection(String type) {
		if (type.equals("Oracle")) {
			return new SecureOracleConnection();
		} else if (type.equals("SQL")) {
			return new SecureSQLConnection();
		} else {
			return new SecureSysbaseConnection();
		}
	}

}
