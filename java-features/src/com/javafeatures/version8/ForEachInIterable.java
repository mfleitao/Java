package com.javafeatures.version8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachInIterable {

	public static void main(String[] args) {
		
		List<Integer> myIntegerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// using iterator to get values from a list
		Iterator<Integer> iterator = myIntegerList.iterator();
		
		while (iterator.hasNext())
			System.out.println("Iterator output: "+ iterator.next());
		
		
		// using forEach by implementing 'Consumer' using Inner Class
		myIntegerList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer value) {
				System.out.println("forEach output: "+ value);
			}
		});
		
		// using forEach by implementing 'Consumer' using Lambda Expression
		myIntegerList.forEach((value) -> System.out.println("forEach & Lambda: "+ value));
		
	}
	
}
