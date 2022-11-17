package com.nt.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Employee;

@Controller
public class TestController {

	/*@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		// add attribute
		map.put("name","ah");
		map.put("age", 40);
		map.put("address","mumbai");
		// return LVN
		return "show_report";
	}*/
	
	/*@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
	
		String nickName[] = new String[]{"raja","rani","Ajay","madhu"};
		Set<Long> mobilePhonesSet = new HashSet<>();
		mobilePhonesSet.add(8793819223L);mobilePhonesSet.add(9283567659L);
		List<String> courses = List.of("Full Stack Java","python","Html/CSS",".Net","Angular");
		Map<String, Object> idsMap = Map.of("adhar no",658565856595L,
																					"voter id","5685d685",
																					"Pan No","GHTPS5992D");
		
		// create attributes
		map.put("nickNames", nickName);
		map.put("phonesInfo",mobilePhonesSet);
		map.put("coursesInfo", courses);
		map.put("idsMap", idsMap);
		
		// return LVN
		return "show_report";
	}*/
	
	/*@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
	
		List<Employee> empList = List.of(new Employee(100,"Ajay", "Software Engineer",440000.0),
																		new Employee(101,"Ahmed","Developer",78000.0),
																		new Employee(102,"Rajesh","TL",180000.0)
																		);
		
		// add attributes
		map.put("empsInfo", empList);
		
		// return LVN
		return "show_report";
	}*/
	
	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		
		Employee emp = new Employee(1001,"Ajay Sawant","Developer",55000.0);
		
		// add attribute
		map.put("empInfo", emp);
		
		// return LVN
		return "show_report";
	}
}
