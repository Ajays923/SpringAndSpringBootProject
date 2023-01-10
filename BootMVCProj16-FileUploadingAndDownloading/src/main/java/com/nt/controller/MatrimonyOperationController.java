package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.model.MarriageSeeker;
import com.nt.service.IMatrimonyMgmtService;

@Controller
public class MatrimonyOperationController {
	@Autowired
	private IMatrimonyMgmtService service;
	
	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}
	@GetMapping("/register")
	public String showProfileFormPage(@ModelAttribute("profile")MarriageSeeker seekar) {
		return "marriage_seeker_register";
	}
	
}
