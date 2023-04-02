package com.examples.SpringMVCORM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.SpringMVCORM.dao.Userdao;
import com.examples.SpringMVCORM.entity.User;

@Service
public class Userserviceimpl implements Userservice{
  @Autowired
  private Userdao userdao;
	@Override
	@Transactional
	public int save(User user) {
		// TODO Auto-generated method stub
		return userdao.create(user);
	}
	

}
