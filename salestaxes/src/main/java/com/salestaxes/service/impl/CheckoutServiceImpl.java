package com.salestaxes.service.impl;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

import com.salestaxes.entity.Basket;
import com.salestaxes.entity.Item;
import com.salestaxes.enums.ExemptProductsEnum;
import com.salestaxes.service.CheckoutService;
import com.salestaxes.vo.ItemReceiptVO;
import com.salestaxes.vo.ReceiptVO;

@Service
public class CheckoutServiceImpl implements CheckoutService {
	
	private final double IMPORTED_EXEMPT_PRODUCT_RATE = 0.05;
	
	private final double REGULAR_PRODUCT_RATE = 0.10;
	
	private final double IMPORTED_PRODUCT_RATE = 0.15;

	
	@Override
	public ReceiptVO calcTaxes4Receipt(Basket basket) {
		double tax = 0.0;
		ReceiptVO receipt = new ReceiptVO();
		
		for (Item item : basket.getItems()) {
			if (item.isImported()) {
				tax = (isProductExempt(item.getTypeCode())) ? (item.getPrice() * IMPORTED_EXEMPT_PRODUCT_RATE) 
						: (item.getPrice() * IMPORTED_PRODUCT_RATE);
			}
			else {
				if (!isProductExempt(item.getTypeCode()))
					tax = (item.getPrice() * REGULAR_PRODUCT_RATE);
			}
			
			double itemPrice = roundUp((item.getPrice()) + tax) * item.getAmount();
			receipt.getItems().add(new ItemReceiptVO(item.getName()+", "+item.getTypeName(),
					item.getAmount(), itemPrice, formatDecimal(tax)));
			
			receipt.setSalesTaxes(receipt.getSalesTaxes() + tax);
			receipt.setTotal(receipt.getTotal() + itemPrice);
			tax = 0.0;
		}
		
		receipt.setSalesTaxes(roundUp(receipt.getSalesTaxes()));
		receipt.setTotal(roundUp(receipt.getTotal()));
		
		return receipt;
	}
	

	private double roundUp(double tax) {
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.UP);
		return Double.parseDouble(df.format(tax));
	}

	
	private boolean isProductExempt(int typeCode) {
		for (ExemptProductsEnum exempt : ExemptProductsEnum.values()) {
			if (exempt.getType() == typeCode) 
				return true;
		}
		return false;
	}
	
	
	private double formatDecimal(double value) {
		return Double.parseDouble(String.format("%.2f", value));
	}

}

