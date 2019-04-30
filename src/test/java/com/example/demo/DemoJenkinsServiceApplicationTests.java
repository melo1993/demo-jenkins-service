package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	@GetMapping("/index")
	public Map<String, String> index()
	{
		Map<String, String> result = new HashMap<>();
		result.put("test1", "test1");
		result.put("test2", "test2");
		result.put("test3", "test3");
		return result;
	}
}
