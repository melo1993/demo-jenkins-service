package com.example.demo;

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
