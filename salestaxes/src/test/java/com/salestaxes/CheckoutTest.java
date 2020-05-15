package com.salestaxes;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.salestaxes.entity.Basket;
import com.salestaxes.entity.Item;
import com.salestaxes.repository.BasketRepository;
import com.salestaxes.repository.ItemRepository;
import com.salestaxes.service.CheckoutService;
import com.salestaxes.vo.ItemReceiptVO;
import com.salestaxes.vo.ReceiptVO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApp.class)
public class CheckoutTest {

	@Autowired
	private CheckoutService service;
	
	@Autowired
	private BasketRepository basketRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Test
	public void testCheckoutReceipt() {
		
		Basket justCreated = basketRepository.save(new Basket(new Date()));
		Basket basket = basketRepository.findById(justCreated.getId()).get();
		assertNotNull(basket);
		assertEquals(justCreated.getId(), basket.getId());
		
		itemRepository.save(new Item("Clean Code", 1, "Book", 47.89, 1, false, basket.getId()));
		itemRepository.save(new Item("Snickers Chocolate Bar", 2, "Food", 0.85, 2, false, basket.getId()));
		itemRepository.save(new Item("Imported Bottle of Perfume", 4, "Cosmetic", 76.90, 1, true, basket.getId()));
		itemRepository.save(new Item("Packet of Headache Pills", 3, "Medical", 8.49, 1, false, basket.getId()));
		
		Basket basket2 = basketRepository.findById(basket.getId()).get();
		
//		for (Item item : basket2.getItems()) {
//			assertNotNull(item.getName());
//	        assertNotNull(item.getTypeName());
//	        assertNotNull(item.isImported());
//	        assertNotEquals(0, item.getAmount());
//	        assertNotEquals(0, item.getBasketId());
//	        assertNotEquals(0, item.getPrice());
//	        assertNotEquals(0, item.getTypeCode());
//	        assertEquals(basket.getId(), item.getBasketId());
//		}
//		
//		ReceiptVO receipt = service.calcTaxes4Receipt(basket);
//		assertNotEquals(0, receipt.getTotal());
//		assertNotEquals(0, receipt.getItems().size());
//		
//		for (ItemReceiptVO vo : receipt.getItems()) {
//			assertNotEquals(0, vo.getAmount());
//			assertNotNull(vo.getName());
//			assertNotEquals(0, vo.getPrice());
//		}
	}
	
}
