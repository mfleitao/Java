package com.salestaxes;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.salestaxes.entity.Category;
import com.salestaxes.repository.CategoryRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApp.class)
public class CategoryTest {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Test
	public void testListAllCategories() {
		
		List<Category> categories = (List<Category>) categoryRepository.findAll();
		assertNotEquals(0, categories.size());
		assertNotEquals(0, categories.get(0).getId());
		
		for (Category ct : categories) {
			assertNotEquals(0, ct.getId());
			assertNotNull(ct.getName());
		}
	}

}
