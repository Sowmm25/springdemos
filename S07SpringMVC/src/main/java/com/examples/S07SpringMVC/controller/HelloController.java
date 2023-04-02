package com.examples.S07SpringMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07SpringMVC.model.Employee;
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("id", 123);
		modelView.addObject("name", "java");
		modelView.setViewName("hello");
		return modelView;
		
	}
	@RequestMapping("/readobject")
	public ModelAndView read2() {
		ModelAndView modelView=new ModelAndView();
		Employee emp=new Employee();
		emp.setId(2);
		emp.setName("kevin");
		emp.setSalary(1200);
		modelView.addObject("employee",emp);
		modelView.setViewName("employee");
		return modelView;
		
	}
	@RequestMapping("/employees")
	public ModelAndView read3() {
		ModelAndView modelView=new ModelAndView();
		List<Employee> employees=new ArrayList<>();
		Employee emp=new Employee();
		emp.setId(2);
		emp.setName("kevin");
		emp.setSalary(1200);
		employees.add(emp);
		emp=new Employee();
		emp.setId(3);
		emp.setName("jack");
		emp.setSalary(1300);
		employees.add(emp);
		modelView.addObject("employees", employees);
		modelView.setViewName("employees");
		return modelView;
		
	}
	@RequestMapping("/showdata")
	public ModelAndView showdata(@RequestParam("id") int id,@RequestParam("name") String name) {
		System.out.println("id:"+id);
		System.out.println("name: "+name);
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("id", id);
		modelView.addObject("name",name);
		modelView.setViewName("showdata");
		
		return modelView;
		
	}


}
