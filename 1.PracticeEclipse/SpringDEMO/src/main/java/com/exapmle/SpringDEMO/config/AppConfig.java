package com.exapmle.SpringDEMO.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.exapmle.SpringDEMO.Computer;
import com.exapmle.SpringDEMO.Demo;
import com.exapmle.SpringDEMO.Desktop;
import com.exapmle.SpringDEMO.Example;

@Configuration 	//to add configuartion config application
@ComponentScan("com.exapmle.SpringDEMO") //will check weather class having component annotation
//when we use @component on clasess we dont have to code each bean or creatio of mehtods inside this class or else commented code has to write

public class AppConfig {

//	//@Bean(name="com2")
//	//@Bean(name={"com2","desk"})	//for providing multiple names
//	@Bean
//	//@Scope("prototype")		//by default bean is singleton 
//	public Desktop desktop() {	//method 
//		return new Desktop();		//we are getting object manged by spring
//	}//desktop returns the obj of desktop
//	
//	@Bean
//	//public Example example(@Autowired Computer com) {	//check for computer class and before autowired is compulsory but now it works without autowired annotation
//	//	public Example example(@Qualifier("desktop") Computer com) {	//you can mention the name of the object you want to refer to 
//	public Example example(Computer com) {	
//	Example obj=new Example();
//		obj.setAge(31);
//		//obj.setCom(desktop());//desktop returns the obj of desktop here its tightly coupled
//		obj.setCom(com);
//		return obj;
//		//return new Example();
//	}
//	
//	@Primary	//without this we will get error its the indication to take the bean
//	@Bean
//	public Demo demo() {
//		return new Demo();
//	}
}
