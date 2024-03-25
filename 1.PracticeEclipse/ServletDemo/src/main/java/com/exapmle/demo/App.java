package com.exapmle.demo;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        
        //to run tomcat server
        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8080);
       
      //for embdedd we have to configure
        Context context=tomcat.addContext("",null); //object of context with tomcat of parameters defalut and null
        Tomcat.addServlet(context,"h1",new HelloServlet());//static method of tomcat(context,nameof servlet,object of class)
        context.addServletMappingDecoded("/hello","h1");	//actual mapping with decodded method(url,name of servelt)
    
        tomcat.start();
        tomcat.getServer().await();
    }
}
