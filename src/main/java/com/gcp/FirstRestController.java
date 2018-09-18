package com.gcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class FirstRestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!!!!";
	}
	
	@GetMapping("/students/{studentId}")
	public int getStudent(@PathVariable int studentId) {
		return studentId;
	}
	
	
	@GetMapping("/save")
	public Test saveTest() {
		
		Test test = new Test();
		test.setNombre("Test 01");
		testService.saveTest(test);
		return test;
		
	}
}
