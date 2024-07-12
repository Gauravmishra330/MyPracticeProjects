package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Newmvc {

	@GetMapping("/log")
	public String getnewlogin() {
		return "/WEB-INF/newview/Newlogin.jsp";
	}
	//Emp emp,emp.getName(),emp.getPass()	 
@PostMapping("/login1")
public String getlogin(ModelMap map,String name,String pass) {
	map.addAttribute("name",name);
	map.addAttribute("pass",pass);
	return "/WEB-INF/newview/Newwelcome.jsp";
}

}
