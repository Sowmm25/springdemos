package com.examples.S01springcoreapp;

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
    	ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S01springcoreapp\\springconfig.xml");
    	Employee emp=(Employee) cnt.getBean("emp2");
    	System.out.println(emp);
    	Employee emp2=(Employee) cnt.getBean("emp");
    	System.out.println(emp2);
    	Employee emp3=(Employee) cnt.getBean("emp3");
    	System.out.println(emp3);
    	Employee emp4=(Employee) cnt.getBean("emp4");
    	System.out.println(emp4);
    	Employee emp5=(Employee) cnt.getBean("emp5");
    	System.out.println(emp5);
    	Employee emp6=(Employee) cnt.getBean("emp6");
    	System.out.println(emp6);
    	Employee emp7=(Employee) cnt.getBean("emp7");
    	System.out.println(emp7);
    	shoppingcart emp8=(shoppingcart) cnt.getBean("emp8");
    	System.out.println(emp8);
    }
}
