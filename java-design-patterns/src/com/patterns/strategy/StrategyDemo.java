package com.patterns.strategy;

import java.math.BigDecimal;

public class StrategyDemo {

	public static void main(String[] args) {
		
		DiscounterContext easterDiscounter = new DiscounterContext(new EasterDiscounter());
		BigDecimal easterDiscountResult = easterDiscounter.execute(BigDecimal.valueOf(100));
		
		DiscounterContext christmasDiscounter = new DiscounterContext(new ChristmasDiscounter());
		BigDecimal christmasDiscountResult = christmasDiscounter.execute(BigDecimal.valueOf(230));
		
		System.out.println("Easter Discount of 100 is "+ easterDiscountResult);
		System.out.println("Christmas Discount of 230 is "+ christmasDiscountResult);
		
	}
	
}
