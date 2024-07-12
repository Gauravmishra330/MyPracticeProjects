package restpractise.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import restpractise.base.dto.Martemp;
import restpractise.base.service.serviceinf;

@RestController
public class Martcontroller {
 @Autowired
private serviceinf service;	
 
 @PostMapping(path="/add",consumes = {MediaType.APPLICATION_JSON_VALUE})
 public Martemp addData(@RequestBody Martemp emp) {
Martemp empl=service.addData(emp);
	return empl;
 }
 @GetMapping(path="/find",produces = {MediaType.APPLICATION_JSON_VALUE})
 public Martemp findData(Martemp emp) {
	Martemp emp1=service.findData(emp);
	return emp1;
 }
 @GetMapping(path="/findall",produces = {MediaType.APPLICATION_JSON_VALUE})
 public List<Martemp> findall() {
	 List<Martemp> list=service.findall();
	 return list;
 }
 @GetMapping(path="/delete")
 public boolean delete(Martemp emp) {
	 return service.delete(emp);
 }
 @GetMapping(path="/update",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
 public boolean update(@RequestBody Martemp emp) {
	 return service.update(emp);
 }
}
