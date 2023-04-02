package com.examples.S04SpringJDBC;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.S04SpringJDBC.dao.EmployeeDAO;
import com.examples.S04SpringJDBC.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "JDBC Template demo" );
        ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S04SpringJDBC\\springconfig.xml");
        EmployeeDAO employeedao=(EmployeeDAO) cnt.getBean("employeedao");
        Employee emp=new Employee();
        emp.setId(2);
        emp.setFirstname("alice");
        emp.setLastname("p");
       //employeedao.create(emp);
        //employeedao.update(emp, "flower",1);
        //employeedao.delete( 1);
        readOneEmployee();
        read();
        
    }
    public static void readOneEmployee() {
    	ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S04SpringJDBC\\springconfig.xml");
        EmployeeDAO employeedao=(EmployeeDAO) cnt.getBean("employeedao");
        Employee emp=employeedao.read(1);
        System.out.println(emp);
        
    	
    }
    public static void read() {
    	ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com\\examples\\S04SpringJDBC\\springconfig.xml");
        EmployeeDAO employeedao=(EmployeeDAO) cnt.getBean("employeedao");
        List<Employee> emp=employeedao.read();
        System.out.println(emp);
        
    	
    }
}
