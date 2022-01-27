package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	public String sayHello(String name){
		return "Hello World " + name;
	}
}