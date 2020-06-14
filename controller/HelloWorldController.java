package com.merlind.merlindbatik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class HelloWorldController {
	public String helloWorld() {
		return "Hello cantik";
	}
	
	@GetMapping("/hello/{name}")
	public String helloName(@PathVariable() String name) {
		return "hello "+ name;
	}
	
	@GetMapping("angka/{nomor}")
	public int angka(@PathVariable() int nomor) {
		return nomor;
	}
}
