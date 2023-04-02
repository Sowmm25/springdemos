package com.examples.S01springcoreapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
  public Employee emp1() {
	  Employee emp=new Employee();
	  emp.setId(11);
	  emp.setName("Jack");
	  return emp;
  }
	@Bean
	  public Employee emp2() {
		  Employee emp=new Employee();
		  emp.setId(12);
		  emp.setName("John");
		  return emp;
	  }
	@Bean
	  public Employee emp3() {
		  Employee emp=new Employee();
		  emp.setId(13);
		  emp.setName("ALice");
		  return emp;
	  }
	@Bean
	  public Employee emp4() {
		  Employee emp=new Employee();
		  emp.setId(14);
		  emp.setName("ALice");
		  List<String> departments=new ArrayList<>();
		  departments.add("HR");
		  departments.add("development");
		  departments.add("admin");
		  emp.setDepartments(departments);
		  return emp;
	  }
	@Bean
	  public Employee emp5() {
		  Employee emp=new Employee();
		  emp.setId(14);
		  emp.setName("Micahel");
		  return emp;
	  }
	@Bean
	  public Employee emp6() {
		  Employee emp=new Employee();
		  emp.setId(15);
		  emp.setName("ALicia");
		  return emp;
	  }
	@Bean
	  public Employee emp7() {
		  Employee emp=new Employee();
		  emp.setId(13);
		  emp.setName("ALice");
		  Address address=new Address();
		  address.setCity("banglore");
		  address.setState("karnataka");
		  address.setPincode("570038");
		  emp.setAddress(address);
		  return emp;
	  }
}
