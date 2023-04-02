package com.examples.S04InterfaceInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class orderServiceimpl implements orderService{
	@Autowired
	@Qualifier("orderdaomysql")
	private orderDAO orderdao;
	@Override
	public void placeOrder() {
		System.out.println("perform business logic");
		System.out.println("ready to create order");
		orderdao.createorder();
	}

}
