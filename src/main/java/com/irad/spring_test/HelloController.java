package com.irad.spring_test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController // Combines the functionality of @Controller and @ResponseBody annotations, to indicate this controller will return data rather than a view.
public class HelloController {
	
	@RequestMapping("/hello")
	public String index(@RequestParam(name="name", required=false, defaultValue="World") String name) {
		return "Hello, " + name + "!\n";
	}
}