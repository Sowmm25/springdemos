package com.examples.S03steriotypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  
    			ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S03steriotypes\\springconfig.xml");
    		Instructor emp=(Instructor) cnt.getBean("instructor");
    			System.out.println(emp);
    			
    }
}
