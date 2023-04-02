package com.example.S11SpringBootJPA;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringBootJPA.entity.Product;
import com.example.S11SpringBootJPA.entity.Productrepository;

@SpringBootTest
class S11SpringBootJpaApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
	}
	//@Test
	void createProduct() {
		Product product=new Product();
		product.setName("Laptop");
		product.setDescription("Dell Laptop");
		product.setPrice(11000);
		Productrepository productrepository=context.getBean(Productrepository.class);
		productrepository.save(product);
	}
	//@Test
	void readProduct() {
		
		Productrepository productrepository=context.getBean(Productrepository.class);
		Optional<Product> optionalproduct= productrepository.findById(3);
		if(optionalproduct.isPresent()) {
			Product product=optionalproduct.get();
			System.out.println(product);
			
		}else {
			System.out.println("product not found in db");
		}
		
	}
	//@Test
	void updateProduct() {
		
		Productrepository productrepository=context.getBean(Productrepository.class);
		Optional<Product> optionalproduct= productrepository.findById(3);
		if(optionalproduct.isPresent()) {
			Product product=optionalproduct.get();
			System.out.println(product);
			product.setPrice(5000);
			productrepository.save(product);
		}else {
			System.out.println("product not found in db");
		}
}
	//@Test
	void readAll() {
		Productrepository productrepository=context.getBean(Productrepository.class);
		List<Product> products= (List<Product>) productrepository.findAll();
		System.out.println(products);
		
	}
	@Test
	void readByName() {
		Productrepository productrepository=context.getBean(Productrepository.class);
		List<Product> products= (List<Product>) productrepository.findByName("Laptop");
		System.out.println(products);
		
	}
}
