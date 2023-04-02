package com.examples.S04InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S04InterfaceInjection\\springconfig.xml");
      orderService orderservice=(orderService) cnt.getBean("orderservice");
      orderservice.placeOrder();
    }
}
