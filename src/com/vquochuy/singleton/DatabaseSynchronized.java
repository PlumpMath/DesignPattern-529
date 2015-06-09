package com.vquochuy.singleton;

public class DatabaseSynchronized {
	private static DatabaseSynchronized databaseSynchronized;
	//private static final DatabaseSynchronized INSTANCE = new DatabaseSynchronized();
	private DatabaseSynchronized() {
	}

	public static synchronized DatabaseSynchronized getInstance() {
		if (databaseSynchronized == null) {
			databaseSynchronized = new DatabaseSynchronized();
		}
		return databaseSynchronized;

	}

	public String showMessage() {
		return "Connect to Database!!";
	}

}
