package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/index")

public class TestController {
	@GetMapping("/index")
	public Map<String, String> index(){
		Map<String, String> result = new HashMap<>();
		result.put("test1", "test1");
		result.put("test2", "test2");
		result.put("test3", "test3");
		return result;
	}
}
