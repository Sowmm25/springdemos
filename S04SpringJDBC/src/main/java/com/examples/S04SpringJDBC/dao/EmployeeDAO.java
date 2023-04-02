package com.examples.S04SpringJDBC.dao;
import java.util.List;

import com.examples.S04SpringJDBC.entity.*;

public interface EmployeeDAO {
	int create(Employee employee);
	
	int update(Employee employee, String fname, int id);
	int delete(int id);
	Employee read(int id);
	List read();

}
