package com.javafeatures.version8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class UnderstandingIterator {
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		/**
		 * Displays List by Iterator via 'For' Loop
		 */
		for (Iterator<Integer> i = intList.iterator(); i.hasNext();)
			System.out.print(i.next() +" ");
		System.out.print("\n");
		
		// -------------------------------------------------------------------------------------------------------------
		
		/**
		 * Displays List by Iterator via 'While' Loop
		 */
		Iterator<Integer> it = intList.iterator();
		while (it.hasNext())
			System.out.print(it.next() +" ");
		System.out.print("\n");
		
		// -------------------------------------------------------------------------------------------------------------

		/**
		 * Displays List by ForEach via 'accept' method implementation of Consumer
		 */
		intList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.print(i +" ");
			}
		});
		System.out.print("\n");
		
		// -------------------------------------------------------------------------------------------------------------
		
		/**
		 * Modifying an element by Iterator
		 */
		ListIterator<Integer> i = intList.listIterator();
		if (i.hasNext()) {
			i.next();
			i.set(Integer.valueOf(9));
		}

		// -------------------------------------------------------------------------------------------------------------
		
		/**
		 * Displays List by ForEach via Lambda Expression 
		 */
		intList.forEach(value -> System.out.print(value +" "));
		System.out.print("\n");
		
	}

}
