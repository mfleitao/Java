package com.salestaxes.vo;

import java.util.List;

public class BasketItemsVO {

	private int basketId;

	private List<ItemVO> items;

	public int getBasketId() {
		return basketId;
	}

	public void setBasketId(int basketId) {
		this.basketId = basketId;
	}

	public List<ItemVO> getItems() {
		return items;
	}

	public void setItems(List<ItemVO> items) {
		this.items = items;
	}

}
