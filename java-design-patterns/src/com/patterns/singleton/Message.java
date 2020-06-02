package com.patterns.singleton;

public interface Message {
	
	public default void print(Class<?> clazz) {
		System.out.println("-> Message from an instance created via "+ clazz.getSimpleName() +" Class");
	}
	
}
