package com.javafeatures.version8;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FunctionalInterfaceWithLambda {

	public static void main(String[] args) {
		
		/**
		 * Implementing 'display' method using Anonymous Class
		 */
		DefaultAndStaticInterface byAnonymousClass = new DefaultAndStaticInterface() {
			@Override
			public void display(String str) {
				System.out.println("Displaying by Anonymous Class: "+ str);
			}
		};
		byAnonymousClass.display("Hello");
		
		// -------------------------------------------------------------------------------------------------------------

		/**
		 * Using LAMBDA Expressions (there is no runtime benefits, only less coding)
		 */
		DefaultAndStaticInterface byLambda1 = (str) -> { 
			System.out.println("Displaying by Lambda: "+ str); 
		};
		byLambda1.display("Hello");
		
		DefaultAndStaticInterface byLambda2 = (str) -> System.out.println("Displaying by Lambda: "+ str);
		byLambda2.display("Hello");
		
		// -------------------------------------------------------------------------------------------------------------
		
		/**
		 * An examples with Lambda and Stream
		 */
		Map<String, BigDecimal> shoppingCarItems = new HashMap<>();
		shoppingCarItems.put("Apple iPhone 11 Black", BigDecimal.valueOf(889.90));
		shoppingCarItems.put("DELL Laptop 13 Core i7", BigDecimal.valueOf(1890.0));
		shoppingCarItems.put("Samsung TV LED 55 inches", BigDecimal.valueOf(960.0));
		shoppingCarItems.put("Asus Monitor 27 inches LED", BigDecimal.valueOf(150.60));
		
		CheckoutInterface checkout = (items) -> {
			return items.values().parallelStream().reduce(BigDecimal.ZERO, BigDecimal::add);
		};
		
		BigDecimal total = checkout.getTotalToBePayed(shoppingCarItems);
		System.out.println("Total to be payed is: "+ total);
		
	}
	
}
