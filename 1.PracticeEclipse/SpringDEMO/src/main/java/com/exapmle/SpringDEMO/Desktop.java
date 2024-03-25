package com.exapmle.SpringDEMO;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary	//for the indication to use this class
@Scope("prototype")
public class Desktop implements Computer {

	public Desktop() {
		System.out.println("object: Desktop class");
	}
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add method: desktop");
	}

}
//@Qulaifier or @Primary used both not used at a time