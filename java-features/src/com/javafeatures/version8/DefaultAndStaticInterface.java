package com.javafeatures.version8;

@FunctionalInterface
public interface DefaultAndStaticInterface {

	void display(String str);
	
	default void log(String str) {
		System.out.println("LOG: "+ str);
	}
	
	static void print(String str) {
		System.out.println("Print: "+ str);
	}
	
}
