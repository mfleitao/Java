package com.salestaxes.repository;

import org.springframework.data.repository.CrudRepository;

import com.salestaxes.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
