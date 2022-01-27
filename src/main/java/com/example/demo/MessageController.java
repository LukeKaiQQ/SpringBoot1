package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String sayHelloGet(@RequestParam("name") String name) {
		return messageService.sayHello(name);
	}
	
	@RequestMapping(value = "/demo", method = RequestMethod.POST)
	public String sayHelloPost(@RequestParam("name") String name) {
		return messageService.sayHello(name);
	}
	
	@RequestMapping(value = "/demo3/{name}")
	public String sayHelloParam(@ModelAttribute("name") String name) {
		return messageService.sayHello(name);
	}
}

