package com.examples.S06SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringORM.dao.ProductDAO;
import com.examples.S06SpringORM.entity.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		create();
	}

	private static void create() {
    	// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\S06SpringORM\\springconfig.xml");

		ProductDAO productdao=(ProductDAO) ctx.getBean("productdao");
		Product product=new Product();
		product.setId(1);
		product.setName("Computer");
		product.setDescription("Desktop computer");
		product.setPrice(5000.2);
		System.out.println("hi");
		int result=productdao.create(product);
		System.out.println("result is "+result);


    	

   
   

    }
}
