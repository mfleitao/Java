package com.patterns.strategy.lambda;

import java.math.BigDecimal;

@FunctionalInterface
public interface Discounter {

	public BigDecimal applyDiscount(BigDecimal amount);
	
	public static Discounter easterDiscounter() {
		return (amount) -> amount.multiply(BigDecimal.valueOf(0.5));
	}
	
	public static Discounter christmasDisconter() {
		return (amount) -> amount.multiply(BigDecimal.valueOf(0.10));
	}
	
}
