package com.exapmle.SpringDEMO;

import org.springframework.stereotype.Component;

@Component
public class Demo implements Computer {

	public Demo() {
		System.out.println("object: Demo class");
	}
	
	public void add() {
		System.out.println("add method: Demo class");
	}
}
