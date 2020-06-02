package com.patterns.strategy;

import java.math.BigDecimal;

public class DiscounterContext {

	private Discounter discounter;
	
	public DiscounterContext(Discounter discounter) {
		this.discounter = discounter;
	}
	
	public BigDecimal execute(BigDecimal value) {
		return this.discounter.applyDiscount(value);
	}
	
}
