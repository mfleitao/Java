package com.patterns.singleton;

public class Singleton_BillPugh implements Message {

	private Singleton_BillPugh() {
	}
	
	private static class Singleton {
		private static final Singleton_BillPugh INSTANCE = new Singleton_BillPugh();
	}
	
	public static Singleton_BillPugh getInstance() {
		return Singleton.INSTANCE;
	}
	
}
