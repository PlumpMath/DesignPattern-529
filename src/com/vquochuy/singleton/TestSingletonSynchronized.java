package com.vquochuy.singleton;

public class TestSingletonSynchronized implements Runnable{
	Thread thread;
	public static void main(String agrs[]){
		TestSingletonSynchronized testSingletonSynchronized = new TestSingletonSynchronized();
	}
	public TestSingletonSynchronized() {
		DatabaseSynchronized databaseSynchronized;
		databaseSynchronized = DatabaseSynchronized.getInstance();
		thread = new Thread(this);
		thread.start();
		
		System.out.println(databaseSynchronized.showMessage());
	} 
	
	@Override
	public void run() {
		DatabaseSynchronized databaseSynchronized = DatabaseSynchronized.getInstance();
		System.out.print("Thread 2 + "+databaseSynchronized.showMessage());
	}

}
