package com.examples.S01springcoreapp;

public class EmployeeDAO {
	private String dbserver;
	private String dbport;
	
	private String dbuser;
	private String dbpassword;
	public EmployeeDAO(String dbserver, String dbport, String dbuser, String dbpassword) {
		
		this.dbserver = dbserver;
		this.dbport = dbport;
		this.dbuser = dbuser;
		this.dbpassword = dbpassword;
	}
	public Employee getEmployee(int id) {
		return null;
	}
	@Override
	public String toString() {
		return "EmployeeDAO [dbserver=" + dbserver + ", dbport=" + dbport + ", dbuser=" + dbuser + ", dbpassword="
				+ dbpassword + "]";
	}

}
