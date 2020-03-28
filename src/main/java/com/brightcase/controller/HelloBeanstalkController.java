package com.brightcase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBeanstalkController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
}
