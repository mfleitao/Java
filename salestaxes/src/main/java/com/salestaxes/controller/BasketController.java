package com.salestaxes.controller;

import java.util.Date;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salestaxes.entity.Basket;
import com.salestaxes.entity.Item;
import com.salestaxes.exception.SalesTaxesException;
import com.salestaxes.repository.BasketRepository;
import com.salestaxes.repository.ItemRepository;
import com.salestaxes.util.Utils;
import com.salestaxes.vo.ResponseVO;
import com.salestaxes.vo.BasketItemsVO;
import com.salestaxes.vo.BasketVO;
import com.salestaxes.vo.ItemVO;

@RestController
@RequestMapping("/basket")
public class BasketController {
	
	private static final Logger logger = LoggerFactory.getLogger(BasketController.class);

	@Autowired
	private BasketRepository basketRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	
	@GetMapping("/create")
	public ResponseVO<BasketVO> createNewBasket() throws Exception {
		
		ResponseVO<BasketVO> response = new ResponseVO<>();
		logger.info("> Creating a new shopping basket ");
		
		Basket basket = basketRepository.save(new Basket(new Date()));
		if (basket == null)
			throw new SalesTaxesException("> Error: Basket could not be created");
		
		response.setMessage("Basket has been created successfully");
		response.setOutput(new BasketVO(basket.getId(), Utils.convertDateToString(basket.getDate())));
		
		return response;
	}
	
	
	@PostMapping("/add-item")
	public ResponseVO<BasketItemsVO> addItemToBasket(@RequestBody BasketItemsVO basketItemsVO) throws Exception  {
		
		ResponseVO<BasketItemsVO> response = new ResponseVO<>();
		logger.info("> Adding new item to shopping basket");
		
		try {
			Basket basket = basketRepository.findById(basketItemsVO.getBasketId()).get();

			for (ItemVO itemVO : basketItemsVO.getItems()) {
				Item item = new Item();
				item.setAmount(itemVO.getAmount());
				item.setName(itemVO.getName());
				item.setPrice(itemVO.getPrice());
				item.setTypeCode(itemVO.getCategoryCode());
				item.setTypeName(itemVO.getCategoryName());
				item.setImported(itemVO.isImported());
				item.setBasketId(basket.getId());
				
				Item newItem = itemRepository.save(item);
				if (newItem == null)
					throw new SalesTaxesException("> Error: Item could not be created");
			}
		
		} catch (NoSuchElementException e) {
			response.setError("The Basket could not be found or the ID is wrong");
			logger.info(e.getMessage());
		}
		
		response.setMessage("Items have been added successfully");
		response.setOutput(basketItemsVO);
		
		return response;
	}
	
}
