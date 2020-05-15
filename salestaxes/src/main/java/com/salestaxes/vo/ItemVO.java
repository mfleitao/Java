package com.salestaxes.vo;

public class ItemVO {

	private String name;

	private int categoryCode;

	private String categoryName;

	private double price;

	private int amount;

	private boolean isImported;
	
	public ItemVO() {
	}

	public ItemVO(String name, int categoryCode, String categoryName, double price, int amount, boolean isImported) {
		this.name = name;
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
		this.price = price;
		this.amount = amount;
		this.isImported = isImported;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}

}
