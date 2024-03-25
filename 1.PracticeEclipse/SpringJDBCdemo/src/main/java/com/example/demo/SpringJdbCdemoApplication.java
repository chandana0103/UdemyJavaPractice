package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class SpringJdbCdemoApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(SpringJdbCdemoApplication.class, args);
	
		ApplicationContext context=SpringApplication.run(SpringJdbCdemoApplication.class, args);
	
		Student obj=context.getBean(Student.class);
		obj.setRollNo(104);
		obj.setName("chandu");
		obj.setMarks(95);
		
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(obj);
	
		List<Student> students=service.getStudents();
		System.out.println(students);
		
	}

}
//student management project