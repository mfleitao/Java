package com.salestaxes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.salestaxes.SpringBootApp;
import com.salestaxes.entity.Basket;
import com.salestaxes.entity.Item;
import com.salestaxes.repository.BasketRepository;
import com.salestaxes.repository.ItemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApp.class)
public class BasketTest {
	
	@Autowired
	private BasketRepository basketRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Test
	public void testSaveThenRead() {
        Basket bkt1 = basketRepository.save(new Basket(new Date()));
        Basket bkt2 = basketRepository.findById(bkt1.getId()).get();
        assertNotNull(bkt2);
        assertEquals(bkt1.getId(), bkt2.getId());
	}
	
	@Test
	public void testAddItemBasket() {
		Basket found = basketRepository.save(new Basket(new Date()));
        Basket basket = basketRepository.findById(found.getId()).get();
        					
        Item item1 = itemRepository.save(new Item("Clean Code", 1, "Book", 47.89, 1, false, basket.getId()));
        assertNotNull(item1.getName());
        assertNotNull(item1.getTypeName());
        assertNotEquals(0, item1.getAmount());
        assertNotEquals(0, item1.getBasketId());
        assertNotEquals(0, item1.getPrice());
        assertNotEquals(0, item1.getTypeCode());
        assertFalse(item1.isImported());
        assertEquals(47.89, item1.getPrice());
        assertEquals(basket.getId(), item1.getBasketId());
        
        Item item2 = itemRepository.save(new Item("Snickers Chocolate Bar", 2, "Food", 0.85, 2, false, basket.getId()));
        assertNotNull(item2.getName());
        assertNotNull(item2.getTypeName());
        assertNotEquals(0, item2.getAmount());
        assertNotEquals(0, item2.getBasketId());
        assertNotEquals(0, item2.getPrice());
        assertNotEquals(0, item2.getTypeCode());
        assertFalse(item2.isImported());
        assertEquals(0.85, item2.getPrice());
        assertEquals(basket.getId(), item2.getBasketId());
        
        
        Item item3 = itemRepository.save(new Item("Imported Bottle of Perfume", 4, "Cosmetic", 76.90, 1, true, basket.getId()));
        assertNotNull(item3.getName());
        assertNotNull(item3.getTypeName());
        assertNotEquals(0, item3.getAmount());
        assertNotEquals(0, item3.getBasketId());
        assertNotEquals(0, item3.getPrice());
        assertNotEquals(0, item3.getTypeCode());
        assertTrue(item3.isImported());
        assertEquals(76.90, item3.getPrice());
        assertEquals(basket.getId(), item3.getBasketId());
        
        
        Item item4 = itemRepository.save(new Item("Packet of Headache Pills", 3, "Medical", 8.49, 1, false, basket.getId()));
        assertNotNull(item4.getName());
        assertNotNull(item4.getTypeName());
        assertNotEquals(0, item4.getAmount());
        assertNotEquals(0, item4.getBasketId());
        assertNotEquals(0, item4.getPrice());
        assertNotEquals(0, item4.getTypeCode());
        assertFalse(item4.isImported());
        assertEquals(8.49, item4.getPrice());
        assertEquals(basket.getId(), item4.getBasketId());
        
	}
	
}
