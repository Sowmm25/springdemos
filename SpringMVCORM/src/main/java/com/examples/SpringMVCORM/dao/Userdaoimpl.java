package com.examples.SpringMVCORM.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.examples.SpringMVCORM.entity.User;
@Repository
public class Userdaoimpl implements Userdao {
	private static final Class<User> User = null;
	@Autowired
	private HibernateTemplate hibernatetemplate;
	@Override
	public int create(User user) {
		int result=(int) hibernatetemplate.save(user);
		return result;
	}
	@Override
	public List<User> finduser() {
		// TODO Auto-generated method stub
		return hibernatetemplate.loadAll(User);
	}
   
}
