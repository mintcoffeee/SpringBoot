package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HelloController {

	public HelloController() {
		System.out.println("HelloController 기본 생성자");
		
	}
	
	@GetMapping(value ="/hello")
	//@ResponseBody
	//@RestController 를 사용하면 @ResponseBody를 작성하지 않아도 된다. 자동으로 문자열 반환 
	//<-> @Controller 를 사용했다면 사용 해야 한다 
	public String hello(String name) {
		return "안년하세요" + name + "님";
	}
}
