package com.javafeatures.version8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionAndBiFunction {

	public static void main(String[] args) {
		
		System.out.println(process1("Hello Function App!", str -> str.toUpperCase()));
		System.out.println(process1("Hello Function App!", String::toUpperCase)); // by reference
		
		System.out.println(process2("Hello Function App!", 5, (str, i) -> str.substring(i)));
		System.out.println(process2("Hello Function App!", 5, String::substring)); // by reference
		
		System.out.println(process3("Hello Function App!", str -> new String(str)));
		System.out.println(process3("Hello Function App!", String::new)); // by reference
	}

	private static String process1(String str, Function<String, String> processor) {
		return processor.apply(str);
	}
	
	private static String process2(String str, int i, BiFunction<String, Integer, String> processor) {
		return processor.apply(str, i);
	}
	
	private static String process3(String str, Function<String, String> processor) {
		return processor.apply(str);
	}
	
}

