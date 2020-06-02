package com.patterns.singleton;

public class Singleton_ThreadSafe implements Message {

	private static Singleton_ThreadSafe instance;

	private Singleton_ThreadSafe() {
	}

	public synchronized static Singleton_ThreadSafe getInstance() {
		if (instance == null)
			instance = new Singleton_ThreadSafe();
		return instance;
	}
	
}
