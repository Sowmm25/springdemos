package com.examples.S04InterfaceInjection;

import org.springframework.stereotype.Component;

@Component("orderdaomysql")
public class orderDAOoracleimpl implements orderDAO {
@Override
public void createorder() {
	System.out.println("Open connection to mysql");
	System.out.println("run insert statement");
	System.out.println("order created");
}


}
