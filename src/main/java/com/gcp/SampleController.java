package com.gcp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class SampleController {
	
	@GetMapping("")
	public String showHome() {
		return "home";
	}
}
