package com.salestaxes.vo;

public class BasketVO {

	private int baskedId;

	private String date;
	
	public BasketVO() {}

	public BasketVO(int baskedId, String date) {
		this.baskedId = baskedId;
		this.date = date;
	}

	public int getbaskedId() {
		return baskedId;
	}

	public void setbaskedIdId(int baskedId) {
		this.baskedId = baskedId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
