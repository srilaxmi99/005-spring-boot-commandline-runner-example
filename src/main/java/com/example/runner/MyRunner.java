package com.example.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.User;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	private User user;
	
	@Override
	public void run(String... args) throws Exception{
		
		System.out.println("from runner class");
		System.out.println(user);
	}

}