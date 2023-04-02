package com.examples.S03steriotypes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
	@Value("10")
	private int id;
	@Value("abc")
	private String name;
	
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}
	

}
