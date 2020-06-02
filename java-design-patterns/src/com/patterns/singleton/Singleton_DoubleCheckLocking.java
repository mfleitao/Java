package com.patterns.singleton;

public class Singleton_DoubleCheckLocking implements Message {

	private static Singleton_DoubleCheckLocking instance;

	private Singleton_DoubleCheckLocking() {
	}

	public static Singleton_DoubleCheckLocking getInstance() {
		if (instance == null) {
			synchronized (Singleton_DoubleCheckLocking.class) {
				if (instance == null)
					instance = new Singleton_DoubleCheckLocking();
			}
		}
		return instance;
	}
	
}
