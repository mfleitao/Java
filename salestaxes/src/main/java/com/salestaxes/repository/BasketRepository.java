package com.salestaxes.repository;

import org.springframework.data.repository.CrudRepository;

import com.salestaxes.entity.Basket;

public interface BasketRepository extends CrudRepository<Basket, Integer> {

}
