package com.javafeatures.version8;

import java.math.BigDecimal;
import java.util.Map;

@FunctionalInterface
public interface CheckoutInterface {

	BigDecimal getTotalToBePayed(Map<String, BigDecimal> items);
	
}
