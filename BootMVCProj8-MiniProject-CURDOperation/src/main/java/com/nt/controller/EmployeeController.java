package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeController {
	@Autowired
	private IEmployeeMgmtService service;

	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String, Object> map) {
		// use service
		Iterable<Employee> empsList= service.getAllEmployee();
		//keep result as model attribute
		map.put("empList", empsList);
		//return LVN
		return "employee_report";
	}
	@GetMapping("/insert_employee")
	public String showAddEmployee(@ModelAttribute("emp")Employee emp) {
		// return LVN
		return "add_employee";
	}
	
	/*@PostMapping("/insert_employee")
	public String insertEmployee(Map<String, Object> map,@ModelAttribute("emp") Employee emp) {
		// use service
		String result = service.insertEmployee(emp);
		Iterable<Employee> empList=service.getAllEmployee();
		//add result to model attribute
		map.put("resultMsg", result);
		map.put("empList", empList);
		// return LVN
		return "employee_report";
	}*/
	/*@PostMapping("/insert_employee")
	public String insertEmployee(HttpSession ses,
														@ModelAttribute("emp") Employee emp) {*/
		@PostMapping("/insert_employee")
		public String insertEmployee(RedirectAttributes attrs,
														@ModelAttribute("emp") Employee emp) {
		// use service
		String result = service.insertEmployee(emp);
		//add result to model attribute
		attrs.addFlashAttribute("resultMsg", result);
		// return LVN
		return "redirect:emp_report";
	}
	
	@GetMapping("/edit_employee")
	public String showEditEmployeeFormPage(@RequestParam("eno") int eno,
																					@ModelAttribute("emp") Employee emp) {
		// use service
		Employee emp1 = service.getEmployeeByEno(eno);
		BeanUtils.copyProperties(emp1, emp);
		//return LVN
		return "modify_employee";
	}
	
	/*@PostMapping("/edit_employee")
	public String editEmployee(Map<String, Object> map,
														@ModelAttribute("emp")Employee emp ) {
		// use service
		String resullt=service.updateEmployee(emp);
		Iterable<Employee> empList = service.getAllEmployee();
		// keep results in model attribute
		map.put("empList", empList);
		map.put("resultMsg", resullt);
		// return LVN
		return "employee_report";
	}*/
	@PostMapping("/edit_employee")
	public String editEmployee(RedirectAttributes attrs,
														@ModelAttribute("emp")Employee emp ) {
		// use service
		String resullt=service.updateEmployee(emp);
		// keep results in model attribute
		attrs.addFlashAttribute("resultMsg", resullt);
		// return LVN
		return "redirect:emp_report";
	}
	
	@GetMapping("/delete_employee")
	public String deleteEmployee(@RequestParam("eno")int eno,
															Map<String, Object> map) {
		
		// use service
		String result = service.deleteEmployeeByEno(eno);
		Iterable<Employee> empList = service.getAllEmployee();
		// keep result in model attribute
		map.put("empList", empList);
		map.put("resultMsg", result);
		// return LVN
		return "employee_report";
	}
	
	

}
