package com.patterns.singleton;

public class Singleton_LazyInitialization implements Message {

	private static Singleton_LazyInitialization instance;
	
	private Singleton_LazyInitialization() {
	}
	
	public static Singleton_LazyInitialization getInstance() {
		if (instance == null)
			instance = new Singleton_LazyInitialization();
		return instance;
	}
	
}
