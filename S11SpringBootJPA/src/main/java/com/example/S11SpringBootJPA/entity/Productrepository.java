package com.example.S11SpringBootJPA.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Productrepository extends CrudRepository<Product,Integer> {
	List<Product> findByName(String name);
	//List<Product> findByPrice(double price);
	//List<Product> findByNameandPrice(String name,double price);

}
