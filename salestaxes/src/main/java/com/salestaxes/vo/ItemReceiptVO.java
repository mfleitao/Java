package com.salestaxes.vo;

public class ItemReceiptVO {

	private String name;

	private int amount;

	private double price;

	private double tax;
	
	public ItemReceiptVO() {}

	public ItemReceiptVO(String name, int amount, double price, double tax) {
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
