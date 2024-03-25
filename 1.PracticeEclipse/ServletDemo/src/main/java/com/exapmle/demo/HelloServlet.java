package com.exapmle.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/hello")	//to call particular servelets based on request-this works for external servlets
//class used to call and run server
public class HelloServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("in service method");
		
		
		//to print on th output page
		res.setContentType("text/html");//to set type of data
		
		PrintWriter out=res.getWriter();
		out.println("<h2><b>hello world</b></h2>");
		//res.getWriter().println("hello world");//to return something on the output pagewhile running
	}
}
//web.xml--for specifiying serverlets--olden method now is annotaion way
//for embdedd we have to configure
//doGet,doPost--http method to return data