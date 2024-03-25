package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {

	@Value("23")
	private int age;

	private Computer com;
	//private Demo demo;
	

	//getters and setters
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Computer getCom() {
		return com;
	}


	@Autowired
	public void setCom(Computer com) {
		this.com = com;
	}
	
		//method
	public void code() {
		
		//demo.compile();
		com.compile();
		System.out.println("coding");
	}

}
