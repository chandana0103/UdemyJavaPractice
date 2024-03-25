package com.abc.SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
    
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
       // Practice obj=new Practice();
        Practice obj=(Practice) context.getBean("practice");
        
        obj.code();
        }
    
}
