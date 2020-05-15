package com.salestaxes.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salestaxes.entity.Category;
import com.salestaxes.repository.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {

	private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping("/list-all")
	public List<Category> listAll() {
		logger.info("> Retrieving all categories stored");
		return (List<Category>) categoryRepository.findAll();
	}
	
}
