package com.salestaxes.enums;

public enum ExemptProductsEnum {
	
	BOOK(1),
	FOOD(2),
	MEDICAL(3);
	
	private int type;
	
	ExemptProductsEnum(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}

}
