package com.examples.S04SpringJDBC.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.S04SpringJDBC.entity.Employee;
import com.examples.S04SpringJDBC.rowmapper.EmployeeRowMapper;
@Component("employeedao")
public class EmployeeDAOimpl implements EmployeeDAO{
    @Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public int create(Employee employee) {
		// TODO Auto-generated method stub
		String sql="insert into employee values(?,?,?)";
        int result=jdbctemplate.update(sql,employee.getId(),employee.getFirstname(),employee.getLastname());
        System.out.println("data inserted "+result);
		return result;
	}
	@Override
	public int update(Employee employee,String fname,int id) {
		
		// TODO Auto-generated method stub
		String sql="update employee set firstname=? where id=?";
        int result=jdbctemplate.update(sql,fname,id);
        System.out.println("data inserted "+result);
		return result;
	}
	@Override
	public int delete( int id) {
		// TODO Auto-generated method stub
		String sql="delete from employee where id=?";
		   int result=jdbctemplate.update(sql,id);
	      System.out.println("data inserted "+result);
		return result;
	}
	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String sql="select * from employee where id=?";
				EmployeeRowMapper employeerowmapper=new EmployeeRowMapper();
				 Employee employee=jdbctemplate.queryForObject(sql, employeerowmapper,id);
				return employee;
	}
	@Override
	public List read() {
		// TODO Auto-generated method stub
		String sql="select * from employee";
		EmployeeRowMapper employeerowmapper=new EmployeeRowMapper();
		 List<Employee> employee=jdbctemplate.query(sql, employeerowmapper);
		return employee;
	}
	
	

}
