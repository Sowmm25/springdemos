package com.examples.S02springcoreapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 

{   
    public static void main( String[] args )
    {
    	/* Traditional way
        System.out.println( "Hello World!" );
        Employee emp=new Employee();
        emp.setId(1);
        emp.setName("Raj");
        System.out.println(emp);
        */
    	//bean scope- singleton,protype
    	
    
		ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S02springcoreapp\\springconfig.xml");
		Employee emp=(Employee) cnt.getBean("emp");
		System.out.println(emp);
		Employee emp1=(Employee) cnt.getBean("emp1");
		System.out.println(emp1);
    	
    	
	}
	
}
