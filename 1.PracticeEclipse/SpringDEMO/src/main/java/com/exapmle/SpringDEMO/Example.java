package com.exapmle.SpringDEMO;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //we have to give when want object spring will do , and this is is used in java based config
public class Example {

	@Value("23")	//injecting value from outside without hard coding in java based config
	private int age;
	//private Demo dm=new Demo(); old or general method 
	
	//private Demo dm;	//want to assign values then use property in spring.xml file
	
	
	@Autowired	//we are saying to spring go to your conatainer and you will find com object there
	//@Qualifier("demo")	//name is the class name everyting in small letters, search for the name 
	private Computer com;	//interface class 
	
	
	//costructors
	public Example() {
		System.out.println("object: in example class");
	}
//	
//	@ConstructorProperties({"age","dm"})	//to assign values in any order
//	public Example(int age, Computer dm) {	//if we want to assaign values to age, dm we can use constructors injection in spring.xml file
//		//after running this constructor is called because we gave value in xml file
//		System.out.println("parameterized constructor called");
//		this.age=age;
//		this.dm=dm;
//	}
	
	//getters and setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("in setters of setting age");
		this.age = age;
	}
	
//	public Demo getDm() {
//		return dm;
//	}
//	public void setDm(Demo dm) {
//		this.dm = dm;
//	}
	
	
	
	public Computer getCom() {
		return com;
	}

	@Autowired
	//@Qualifier("demo")
	public void setCom(Computer com) {
		this.com = com;
	}

	
	//method
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show method: Example class");
		com.add();
		//dm.add();
	}

	
}
