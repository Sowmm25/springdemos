package com.examples.S06SpringORM.dao;
	import org.springframework.beans.factory.annotation.Autowired;

	import org.springframework.orm.hibernate5.HibernateTemplate;

	import org.springframework.stereotype.Component;

	import org.springframework.transaction.annotation.Transactional;

    import com.examples.S06SpringORM.entity.Product;

	public interface ProductDAO{
		int create(Product product);
		
	}

   
    

	//void update(Product product);






