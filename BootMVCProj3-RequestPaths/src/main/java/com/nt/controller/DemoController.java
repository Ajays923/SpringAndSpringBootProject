package com.nt.controller;

import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {
	/*@Autowired
	private ServletContext sc;
	@Autowired
	private ServletConfig cg;
	@Autowired
	private HttpSession ses;
	
	@GetMapping(value = {"/report"})
	public String showReport1(Map<String, Object> map) {
		System.out.println("DemoController.showReport1()");
		System.out.println("Web app name:: "+sc.getContextPath());
		System.out.println("DS logical name:: "+cg.getServletName());
		System.out.println("Session id:: "+ses.getId());
		return "display";
	}*/
	
	@GetMapping(value = {"/report"})
	public String showReport1(Map<String, Object> map,
														HttpSession ses) {
		System.out.println("Session id:: "+ses.getId());
		System.out.println("DemoController.showReport1()");
		return "display";
	}
}
