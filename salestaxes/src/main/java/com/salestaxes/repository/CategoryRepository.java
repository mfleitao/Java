package com.salestaxes.repository;

import org.springframework.data.repository.CrudRepository;

import com.salestaxes.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
