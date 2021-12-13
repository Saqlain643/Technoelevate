package com.technoelevate.springmvcpractice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpringController {

	@GetMapping(path = "/register")
	public String register() {
		return "register";
	}
	
	@PostMapping(path = "/register")
	public String getDetails(HttpServletRequest request, ModelMap map) {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String age = request.getParameter("age");
		String email=request.getParameter("mail");
		String gender=request.getParameter("gender");
		String number=request.getParameter("number");
		String address=request.getParameter("address");
		map.addAttribute("fname", fname);
		map.addAttribute("lname", lname);
		map.addAttribute("age", age);
		map.addAttribute("email", email);
		map.addAttribute("gender", gender);
		map.addAttribute("number", number);
		map.addAttribute("address", address);
		return "details";
		
	}
}
