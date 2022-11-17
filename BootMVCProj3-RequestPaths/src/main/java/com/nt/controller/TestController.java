package com.nt.controller;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
		
	//@RequestMapping("/") or
	@GetMapping
	public String showHome() {
		System.out.println("TestController.showHome()");
		return "home";
	}
	@PostMapping
	public String showHome1() {
		System.out.println("TestController.showHome1()");
		return "home";
	}
	//@GetMapping("/report") or
	/*@RequestMapping(value = "/report", method = RequestMethod.GET)
	public String showReport(Map<String, Object> map) {
		System.out.println("TestController.showReport(-)");
		return "display";
	}*/
	//@PostMapping("/report") or
	/*@RequestMapping(value = "/report", method = RequestMethod.POST)
	public String showReport1(Map<String, Object> map) {
		System.out.println("TestController.showReport1(-)");
		return "display1";
	}
	
	@GetMapping(value = {"/report","/report1","/report2"})
	public String showReport(Map<String, Object> map) {
		System.out.println("TestController.showReport(-)");
		return "display";
	}*/
	
	@GetMapping(value = {"/report"})
	public String showReport1(Map<String, Object> map) {
		System.out.println("TestController.showReport1(-)");
		return "display";
	}
	
	
	
}
