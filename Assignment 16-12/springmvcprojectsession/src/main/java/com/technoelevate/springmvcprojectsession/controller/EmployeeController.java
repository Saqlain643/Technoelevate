package com.technoelevate.springmvcprojectsession.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.technoelevate.springmvcprojectsession.dto.EmployeeDto;
import com.technoelevate.springmvcprojectsession.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("/login")
	public String login() {
		return "loginPage";
	}

	@PostMapping("/login")
	public String getLogin(ModelMap map, int eid, String password, HttpServletRequest request) {
		EmployeeDto dto = service.authenticate(eid, password);
		if (dto != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginKey", dto);
			map.addAttribute("msg", dto.getEname());
			return "status";
		} else {
			map.addAttribute("errMsg", "Invalid User");
			return "loginPage";
		}

	}

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("msg", "Logout Sucussful");
		return "loginPage";
	}

	@GetMapping("/search")
	public String search(@SessionAttribute(name = "loginKey", required = false) EmployeeDto dto, ModelMap map) {
		if (dto != null) {
			return "search";
		} else {
			map.addAttribute("msg", "Login First");
			return "loginPage";
		}
	}

	@PostMapping("/search")
	public String searchData(int eid, ModelMap map,
			@SessionAttribute(name = "loginKey", required = false) EmployeeDto dto) {
		EmployeeDto data = service.getData(eid);
		if (dto != null) {
			if (data != null) {
				map.addAttribute("empKey", data);

			} else {
				map.addAttribute("msg", "data not found");
			}
			return "search";
		} else {
			map.addAttribute("errMsg", "Login First");
			return "loginPage";
		}
	}

	@GetMapping("/insert")
	public String addData(ModelMap map, @SessionAttribute(name = "loginKey", required = false) EmployeeDto dto) {
		if (dto != null) {
			return "insert";
		} else {
			map.addAttribute("errMsg", "Please Login First");
			return "loginPage";
		}
	}

	@PostMapping("/insert")
	public String addingData(ModelMap map, int eid, String ename, String position, String password,
			@SessionAttribute(name = "loginKey", required = false) EmployeeDto dto) {
		boolean result = service.insertData(eid, position, ename, password);
		if (dto != null) {
			if (result) {
				map.addAttribute("msg", "Added Succesfully");
				return "insert";
			} else {
				map.addAttribute("msg", "Something went wrong");
				return "insert";
			}
		} else {
			map.addAttribute("errMsg", "Please Login First");
			return "loginPage";
		}
	}

	@GetMapping("/update")
	public String update(ModelMap map, @SessionAttribute(name = "loginKey", required = false) EmployeeDto dto) {
		if (dto != null) {
			return "update";
		} else {
			map.addAttribute("errMsg", "Please login first");
			return "loginPage";
		}
	}

	@PostMapping("/update")
	public String updateData(ModelMap map, int eid, String ename, String password, String position,
			@SessionAttribute(name = "loginKey", required = false) EmployeeDto dto) {
		int result = service.updateData(eid, ename, password, position);
		if (dto != null) {
			if (result == 0) {
				map.addAttribute("msg", "Error while Updating");
				return "update";
			} else {
				map.addAttribute("msg", "Updated Succesfully");
				return "update";
			}
		} else {
			map.addAttribute("errMsg", "Please Login First");
			return "loginPage";
		}
	}

	@GetMapping("/delete")
	public String delete(ModelMap map, @SessionAttribute(name = "loginKey", required = false) EmployeeDto dto) {
		if (dto != null) {
			return "delete";
		} else {
			map.addAttribute("errMsg", "Please Login First");
			return "loginPage";
		}
	}
	
	@PostMapping("/delete")
	public String deleteData(ModelMap map,@SessionAttribute(name = "loginKey", required = false)EmployeeDto dto,int eid) {
		if(dto!=null) {
			boolean result=service.deleteData(eid);
			if(result) {
				map.addAttribute("msg", "Deleted Succesfully");
				return "delete";
			} else {
				map.addAttribute("msg", "Problem while deleting");
				return "delete";
			}
		} else {
			map.addAttribute("errMsg", "Please login First");
			return "loginPage";
		}
	}
}
