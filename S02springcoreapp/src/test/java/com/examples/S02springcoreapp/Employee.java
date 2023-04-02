package com.examples.S02springcoreapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	int id;
	String name;
	private List<String> departments;
	private Properties countrylang;
	@Autowired
	@Qualifier("address1")
	private Address homeaddress;
	@Autowired
	@Qualifier("address2")
	private Address officeaddress;
	Address address1=new Address();
	
	
		public Address getAddress1() {
		return address1;
	}
	public void setAddress(Address address) {
		this.address1 = address;
	}
		public Properties getCountrylang() {
		return countrylang;
	}
	public void setCountrylang(Properties countrylang) {
		this.countrylang = countrylang;
	}
	private Map<Integer,String> products;
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	public <departments> List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ",department="+departments+",products="+products+",language="+countrylang+",address="+address1+",home address="+homeaddress+"]";
	}

}
