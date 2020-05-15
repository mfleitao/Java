package com.salestaxes.vo;

import java.util.ArrayList;
import java.util.List;

public class ReceiptVO {

	private double salesTaxes;

	private double total;

	private List<ItemReceiptVO> items;
	
	public ReceiptVO() {
		this.items = new ArrayList<ItemReceiptVO>();
	}

	public double getSalesTaxes() {
		return salesTaxes;
	}

	public void setSalesTaxes(double salesTaxes) {
		this.salesTaxes = salesTaxes;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<ItemReceiptVO> getItems() {
		return items;
	}

	public void setItems(List<ItemReceiptVO> items) {
		this.items = items;
	}

}
