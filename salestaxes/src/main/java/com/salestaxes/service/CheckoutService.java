package com.salestaxes.service;

import com.salestaxes.entity.Basket;
import com.salestaxes.vo.ReceiptVO;

public interface CheckoutService {

	public ReceiptVO calcTaxes4Receipt(Basket basket);
	
}
