package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Demo implements Computer {

	public void compile() {
		System.out.println("complining in Demo");
	}
}
