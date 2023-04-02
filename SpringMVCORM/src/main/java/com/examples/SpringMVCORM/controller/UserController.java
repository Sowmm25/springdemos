package com.examples.SpringMVCORM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.SpringMVCORM.entity.User;
import com.examples.SpringMVCORM.service.Userservice;

@Controller
public class UserController {
	@Autowired
	private Userservice userservice;
	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "userreg";
	}
	@RequestMapping("/registeruser")
   public String registeruser(@ModelAttribute("user") User user,ModelMap model) {
		int result=userservice.save(user);
		model.addAttribute("message","User created at id"+result);
		return "userreg";
		
	}
}
