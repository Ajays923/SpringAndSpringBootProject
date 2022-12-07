package com.nt.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {
	
	/*@GetMapping("/data")
	public String bindData(Map<String, Object> map ,
												@RequestParam("sno") int sno,
												@RequestParam("sname") String sname) {
		System.out.println(sno+" "+sname);
		
		// return LVN
		return "show_data";
	}*/
	
	/*@GetMapping("/data")
	public String bindData(Map<String, Object> map ,
												@RequestParam int sno,
												@RequestParam String sname) {
		System.out.println(sno+" "+sname);
		
		// return LVN
		return "show_data";
	}*/
	
	/*@GetMapping("/data")
	public String bindData(Map<String, Object> map ,
												@RequestParam int sno,
												@RequestParam(required = false) String sname) {
		System.out.println(sno+" "+sname);
		
		// return LVN
		return "show_data";
	}*/
	
	/*@GetMapping("/data")
	public String bindData(Map<String, Object> map ,
												@RequestParam int sno,
												@RequestParam(defaultValue = "madhuri") String sname) {
		System.out.println(sno+" "+sname);
		
		// return LVN
		return "show_data";
	}*/
	/*@GetMapping("/data")
	public String bindData(Map<String, Object> map ,
												@RequestParam(defaultValue = "100") int sno,
												@RequestParam(defaultValue = "madhuri") String sname) {
		System.out.println(sno+" "+sname);
		
		// return LVN
		return "show_data";
	}*/
	
	/*@GetMapping("/data")
	public String bindData(Map<String, Object> map ,
												@RequestParam(required = false) Integer sno,
												@RequestParam(defaultValue = "madhuri") String sname) {
		System.out.println(sno+" "+sname);
		
		// return LVN
		return "show_data";
	}*/
	
	/*@GetMapping("/data")
	public String bindData(Map<String, Object> map ,
												@RequestParam int sno,
												@RequestParam String[] names,
												@RequestParam("names")  List<String> name) {
		System.out.println(sno+" "+Arrays.toString(names)+" "+name);
		
		// return LVN
		return "show_data";
	}*/
	 
	@GetMapping("/data")
	public String bindData(Map<String, Object> map ,
												@RequestParam int sno,
												@RequestParam String names) {
		System.out.println(sno+" "+names);
		
		// return LVN
		return "show_data";
	}
}


