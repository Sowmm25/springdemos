package com.examples.SpringMVCORM.dao;

import java.util.List;

import com.examples.SpringMVCORM.entity.User;

public interface Userdao {
	int create(User user) ;
	List<User> finduser();

}
