package com.example.S10SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.S10SpringBoot.dao.Somedao;

@Component
public class Someservice {
	@Autowired
	Somedao dao;
	public void create() {
		dao.hello();
	}

}
