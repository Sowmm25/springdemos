package com.examples.S04SpringJDBC.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.examples.S04SpringJDBC.entity.Employee;

public class EmployeeRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setId(rs.getInt(1));
		emp.setFirstname(rs.getString(2));
		emp.setLastname(rs.getString(3));
		return emp;
	}

}
