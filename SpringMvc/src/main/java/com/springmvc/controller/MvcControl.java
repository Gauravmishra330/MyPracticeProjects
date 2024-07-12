package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcControl {
	//static type 
@RequestMapping(path="/home")
public String gethme(Model model) {
	model.addAttribute("name", "asif");
	return "WEB-INF/views/home.jsp";
}
//using http request
@RequestMapping(path = "/loginform",method = RequestMethod.POST)
public String getloginform(ModelMap map,HttpServletRequest request) {
	String identity=request.getParameter("id");
	String password=request.getParameter("pass");
	map.addAttribute("id",identity);
	map.addAttribute("pass",password);
	return "WEB-INF/views/welcome.jsp";
}
	
	@GetMapping("/login")
	public String log() {
		return "WEB-INF/views/loginForm.jsp";
	}
@RequestMapping(path="/login2",method = RequestMethod.POST)
public String getformone(ModelMap map, @RequestParam String id, @RequestParam String pass ) {
map.addAttribute("name",id);
map.addAttribute("pass", pass);
return "WEB-INF/views/welcome.jsp";
}
@PostMapping("/login3")
public String getformthree(ModelMap map,String id,String pass) {
map.addAttribute("name", id);
map.addAttribute("pass", pass);
return "WEB-INF/views/welcome.jsp";
}
@PostMapping("/login4")
public String geteform(ModelMap map,Form form){
	map.addAttribute("eid", form.getEid());
	map.addAttribute("ename",form.getEname());
	return "WEB-INF/views/welcome.jsp";
}
}
