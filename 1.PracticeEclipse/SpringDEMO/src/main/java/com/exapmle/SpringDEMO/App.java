package com.exapmle.SpringDEMO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exapmle.SpringDEMO.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       
//        Desktop obj=context.getBean(Desktop.class);
//        //Desktop obj1=context.getBean("desktop",Desktop.class);	//we can give method name which we gave in appConfig class
//        //Desktop obj2=context.getBean("com2",Desktop.class);	//these bean names provided in appcongfig class
//
//        obj.add();
        
//        Desktop obj3=context.getBean(Desktop.class);
//        obj3.add();
        
        Example obj4= context.getBean(Example.class);
        System.out.println(obj4.getAge());
        obj4.show();	//it will give error beacause its dependent on computer class
        
        
        
        
        
        
        
        
        
        /*
         * 
         * code for XML configauration *******************
         *
         *
         */
//        Example obj=new Example();//manual creation but we need to do by spring so we need to add spring dependencies
//        obj.show();
        
    //	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
        //Example obj1=(Example) context.getBean("example");		//it will give illigal start expression error we can resolve by annotations,java config,xml
        														//here we are using xml create spring.xml in resource path and add (search in google spring 6 configuration xml)
        //obj1.age=21;
        //System.out.println(obj1.age);
        //obj1.show();
        
        /*
         * after creating getters and setters using object
         */
       //obj1.setAge(23);
       //System.out.println(obj1.getAge());
       // obj1.show();
        
       // Example obj2=(Example) context.getBean("example");
       // System.out.println(obj2.age);
       // obj2.show();
        
      //  Desktop obj3=(Desktop) context.getBean("com2");
        
//        //creation of obj without typecasting
//        Example obj4= context.getBean("example",Example.class);	//get bean method to create obj by specifying class name
//        //Computer com=context.getBean(Computer.class);//it will give error if we doesnot provide primary type in xml because computer is interface
//        Desktop obj5= context.getBean(Desktop.class);
    
    }
}
