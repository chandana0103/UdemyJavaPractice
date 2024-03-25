package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Demo;
import com.example.demo.model.Example;
import com.example.demo.service.DemoService;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("hello spring boot");
		
		ApplicationContext context=	SpringApplication.run(SpringBootDemoApplication.class, args);
//													//appication context used to enter containers

		//after creating layers
		DemoService service=context.getBean(DemoService.class);
		Demo obj=context.getBean(Demo.class);
		service.addDemo(obj);
		
		
		
		//before layers
//		Example obj=context.getBean(Example.class);	//it will give nosuch bean error so we have to use annotations(@Component)
//		System.out.println(obj.getAge());
//		obj.code();
		
//		Demo obj2=context.getBean(Demo.class);	//it will give null point exception for demo object so we have to use annotations(@Autowired)
//		obj2.compile();
//		
//	
//	
//		Example obj1=new Example();	//old method to create objects
//		obj1.code();
	}

}

//SpringApplication.run--activates spring frame work
//spring is responsible to create objects and these objects called as beans
//annotaions are used to specify which object we want(@Component annotation) in the class where we want to create/manage objects.