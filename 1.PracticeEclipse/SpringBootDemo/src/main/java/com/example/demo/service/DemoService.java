package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Demo;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoService {

	@Autowired
	private DemoRepository repo;
	
	public void addDemo(Demo dm) {

		repo.save(dm);
		System.out.println("in DemoService-class: addDemo-method");
	
	}
	
	public boolean check(Demo dm) {
		return true;
	}

}
