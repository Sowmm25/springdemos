package com.examples.S06SpringORM.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.examples.S06SpringORM.entity.Product;

@Component("productdao")
public class ProductDAOimpl implements ProductDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
	// TODO Auto-generated method stub
	Integer result=(Integer) hibernateTemplate.save(product);
	
	return result;
	
}

}
