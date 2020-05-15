package com.salestaxes.controller;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.salestaxes.entity.Basket;
import com.salestaxes.exception.SalesTaxesException;
import com.salestaxes.repository.BasketRepository;
import com.salestaxes.service.CheckoutService;
import com.salestaxes.vo.ReceiptVO;
import com.salestaxes.vo.ResponseVO;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {
	
	private static final Logger logger = LoggerFactory.getLogger(CheckoutController.class);
	
	@Autowired
	private CheckoutService service;
	
	@Autowired
	private BasketRepository basketRepository;
	
	
	@GetMapping("/generate-receipt")
	public ResponseVO<ReceiptVO> getReceipt(@RequestParam("basketId") Integer basketId) throws Exception {
		
		ResponseVO<ReceiptVO> response = new ResponseVO<>();
		logger.info("> Generating the receipt of the shopping basket");

		if (basketId == null)
			throw new SalesTaxesException("> Error: Basket ID is missing");
		
		try {
			Basket basket = basketRepository.findById(basketId).get();
			if (basket == null)
				throw new SalesTaxesException("> Error: Basket could not be found or the ID is wrong");
			
			ReceiptVO receiptVO = service.calcTaxes4Receipt(basket);
			
			response.setMessage("Receipt has been generated successfully");
			response.setOutput(receiptVO);
		
		} catch (NoSuchElementException e) {
			response.setError("The Basket could not be found or the ID is wrong");
			logger.info(e.getMessage());
		}
		
		return response;
	}
	
}
