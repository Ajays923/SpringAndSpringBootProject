package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageGeneratorController {
	@Autowired
	private IWishMessageService service;
	
	@RequestMapping("/")
	public String showHome() {
		return "home";	//LVN
	}
	
	/*@RequestMapping("/wish")
	public ModelAndView generateMessage() {
		//use service
		String result = service.generateWishMessage();
		// return MAV
		ModelAndView view = new ModelAndView();
		view.addObject("wMsg", result);
		view.setViewName("display");
		return view;
		//return new ModelAndView("display","wMsg",result);
	}*/
	
	/*@RequestMapping("/wish")
	public String generateMessage(BindingAwareModelMap map) {
		System.out.println(" SharedMemory Obj class name ::"+map.getClass());
		//use service
		String result = service.generateWishMessage();
		// return MAV
		map.addAttribute("wMsg", result);
		
		return "display";
	}*/
	
	/*@RequestMapping("/wish")
	public String generateMessage(ModelMap map) {
		System.out.println(" SharedMemory Obj class name ::"+map.getClass());
		//use service
		String result = service.generateWishMessage();
		// return MAV
		map.addAttribute("wMsg", result);
		return "display";
	}*/
	
	/*@RequestMapping("/wish")
	public String generateMessage(HashMap<String, Object> map) {
		System.out.println(" SharedMemory Obj class name ::"+map.getClass());
		//use service
		String result = service.generateWishMessage();
		// return MAV
		map.put("wMsg", result);
		// return LVN
		return "display";
	}*/
	
	@RequestMapping("/wish")
	public String generateMessage(Map<String, Object> map) {
		System.out.println(" SharedMemory Obj class name ::"+map.getClass());
		//use service
		String result = service.generateWishMessage();
		// return MAV
		map.put("wMsg", result);
		// return LVN
		return "display";
	}
	
	/*@RequestMapping("/wish")
	public String generateMessage(Model model) {
		System.out.println(" SharedMemory Obj class name ::"+model.getClass());
		//use service
		String result = service.generateWishMessage();
		// return MAV
		model.addAttribute("wMsg", result);
		// return LVN
		return "display";
	}*/
	
	/*@RequestMapping("/wish")
	public void generateMessage(Model map) {
		System.out.println(" SharedMemory Obj class name ::"+map.getClass());
		//use service
		String result = service.generateWishMessage();
		// return MAV
		map.addAttribute("wMsg", result);
	}*/
	
	/*@RequestMapping("/wish")
	public Model generateMessage() {
			//use service
		String result = service.generateWishMessage();
		// create model attributes 
		Model model = new ExtendedModelMap();
		// return MAV
		model.addAttribute("wMsg", result);
		return model;
	}*/
	
	/*@RequestMapping("/wish")
	public Map<String, Object> generateMessage() {
			//use service
		String result = service.generateWishMessage();
		// create model attributes 
		Map<String, Object> model = new HashMap<>();
		// return MAV
		model.put("wMsg", result);
		return model;
	}*/
	
	/*@RequestMapping("/wish")
	public void generateMessage(HttpServletResponse res) throws Exception {
		// use service
		String result = service.generateWishMessage();
		// get PrintWriter obj
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<b> wish message is :: </b>"+result);
		return;
	}*/
	
	/*@RequestMapping("/wish")
	public String generateMessage(HttpServletResponse res) throws Exception {
		// use service
		String result = service.generateWishMessage();
		// get PrintWriter obj
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<b> wish message is :: </b>"+result);
		return null;
	}*/
	
}
