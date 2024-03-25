package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {


	@RequestMapping("/")    //url==localhost:8080/
	public String home() {
		//responsible for to call index.jsp file
		
		System.out.println("in home method");
		//return "index.jsp";	//we are returning page here
	
		return "index"; //without adding extensions provide in application properties
	}
	
	
	/********creation of result page*****************/
	
//	@RequestMapping("add")
//	public String add(HttpServletRequest req,HttpSession session) {
//		System.out.println("in add method");
//		
//		int n1=Integer.parseInt(req.getParameter("n1"));
//		int n2=Integer.parseInt(req.getParameter("n2"));
//		int result=n1+n2;
//		//System.out.println(result);//it returns on console
//		
//		session.setAttribute("result", result);//adding data to session object
//
//		
//		return "result.jsp";
	
	//}
	
	//easy method to create and result page
//	@RequestMapping("add")
//	public String add(int n1,int n2,HttpSession session) {
//			
//			int result=n1+n2+2;
//			session.setAttribute("result", result);
//
//				return "result.jsp";
//			
//	}
	
	
//	//for changing parameters name n1 to num1 and n2 to num2
//	@RequestMapping("add")
//	public String add(@RequestParam("n1") int num1,@RequestParam("n2") int num2,HttpSession session) {
//		
//
//		int result=num1+num2;
//		session.setAttribute("result", result);
//
//		return "result.jsp";
//	}
	
	//model is interface used to transfer data between controller and JSP and add attribute , insted of using HTTP we are using model here
//	@RequestMapping("add")
//	public String add(@RequestParam("n1") int num1, @RequestParam("n2") int num2, Model model) {
//
//		System.out.println("in add method");
//		int result = num1 + num2;
//		model.addAttribute("result", result);
//
//		return "result";
//	}
	
	//to create result page based on model and view , we can create multiple objects here
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("n1") int num1, @RequestParam("n2") int num2, ModelAndView mv) {
//
//		int result = num1 + num2;
//		mv.addObject("result",result);
//		mv.setViewName("result");
//
//		return mv;
//	}
//	
	
	//method for adding person id and name to page
//	@RequestMapping("addPerson")
//	public ModelAndView add(@RequestParam("pid") int pid, @RequestParam("pname") String pname, ModelAndView mv) {
//		
//	        Person person=new Person();
//	        person.setPid(pid);
//	        person.setPname(pname);
//			mv.addObject("person",person);
//			mv.setViewName("result");
//
//			return mv;
//		}
	
	//simple method to use when we have more variables 
	@RequestMapping("addPerson")
	public String addAlien(Person person) {
	//public String addAlien(@ModelAttribute("person1") Person person) {//if we want to use differesnt name in html we have to use model attribute
       
		return "result";
	}
	
	//use of model attribute 
	@ModelAttribute("course")
	public String courseName() {
		
		return "JAVA";
	}
}
