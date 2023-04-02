package com.examples.S07SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07SpringMVC.model.User;

@Controller
public class UserController {
	@RequestMapping("/register")
	public ModelAndView showRegistrationPage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("registeruser");
		return mv;
	}
	@RequestMapping(value="/signupuser",method=RequestMethod.POST)
	public ModelAndView SignUpUser(@ModelAttribute("user") User user) {
		ModelAndView mv=new ModelAndView();
		System.out.println("from ui retrieved object");
		mv.addObject("user", user);
		mv.setViewName("registeruserresult");
		return mv;
	}

}
