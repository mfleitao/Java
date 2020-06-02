package com.patterns.strategy.lambda;

import java.math.BigDecimal;

public class StrategyDemo {

	public static void main(String[] args) {
		StrategyDemo.demoImplWithinClass();
		StrategyDemo.demoImplWithinInterface();
	}
	
	public static void demoImplWithinClass() {
		
		Discounter easter = (amount) -> {
			System.out.println("-> Applying Easter Discount");
			return amount.multiply(BigDecimal.valueOf(0.5));
		};
		
		BigDecimal easterDiscount = easter.applyDiscount(BigDecimal.valueOf(100));
		System.out.println("-> Easter Discount of 100 is "+ easterDiscount);
		
		// ----------------------------------------------------------------------------------------------
		
		Discounter christmas = (amount) -> {
			System.out.println("-> Applying Christmas Discount");
			return amount.multiply(BigDecimal.valueOf(0.10));
		};
		
		BigDecimal christmasDiscount = christmas.applyDiscount(BigDecimal.valueOf(230));
		System.out.println("-> Christmas Discount of 230 is "+ christmasDiscount);
	}
	
	public static void demoImplWithinInterface() {
		
		BigDecimal easterDiscount = Discounter.easterDiscounter().applyDiscount(BigDecimal.valueOf(100));
		System.out.println("-> Easter Discount of 100 is "+ easterDiscount);
		
		// ----------------------------------------------------------------------------------------------
		
		BigDecimal christmasDiscount = Discounter.christmasDisconter().applyDiscount(BigDecimal.valueOf(230));
		System.out.println("-> Christmas Discount of 230 is "+ christmasDiscount);
	}
	
}
