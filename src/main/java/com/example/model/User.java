package com.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value("${name}")
	private String name;
	@Value("${age}")
	private Integer age;
	@Value("${value}")
	private String value;
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", value=" + value + "]";
	}
	

}