package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Demo;

@Repository
public class DemoRepository {

	public void save(Demo dm) {
		System.out.println("in repository class:saved in database");
	}
}

//to do CRUD operations