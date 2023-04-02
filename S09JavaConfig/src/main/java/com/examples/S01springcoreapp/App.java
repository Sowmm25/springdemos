package com.examples.S01springcoreapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    	demo1();
    }

	private static void demo1() {
		//ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S01springcoreapp\\springconfig.xml");
    	AnnotationConfigApplicationContext cnt=new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee emp=(Employee) cnt.getBean("emp2");
    	System.out.println(emp);
    	Employee emp2=(Employee) cnt.getBean("emp1");
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
    	
	}
	private static void demo2() {
		ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S01springcoreapp\\springconfig2.xml");
    	car e=(car) cnt.getBean("car1");
    	System.out.println(e.hashCode());
    	car e2=(car) cnt.getBean("car1");
    	System.out.println(e2.hashCode());
       bank e1=(bank) cnt.getBean("bank1");
    	System.out.println(e.hashCode());
    	Object b1=cnt.getBean("bank1");
    	System.out.println(b1.hashCode());
    	Object b2=cnt.getBean("bank1");
    	System.out.println(b2.hashCode());
    	Object b3=cnt.getBean("bank1");
    	System.out.println(b3.hashCode());
		
	}
	private static void demo3() {
		ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S01springcoreapp\\springConfig3.xml");
    	Computer e=(Computer) cnt.getBean("homeComputer");
    	System.out.println(e);
    	Computer e1=(Computer) cnt.getBean("officeComputer");
    	System.out.println(e1);
		
		
	}
	private static void demo4() {
		ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S01springcoreapp\\springConfig4.xml");
    	EmployeeDAO e=(EmployeeDAO) cnt.getBean("dao");
    	System.out.println(e);
		
	}
}
