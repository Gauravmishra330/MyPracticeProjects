package com.te.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.base.dto.Employee;
import com.te.base.dto.EmployeeResponse;
import com.te.base.service.Serviceint;

@RestController
public class EmployeeController {
	@Autowired
private Serviceint service;
	
@PostMapping(path="/add",consumes= {MediaType.APPLICATION_JSON_VALUE})
	public EmployeeResponse add(@RequestBody Employee employee) {
	EmployeeResponse employeeResponse=new EmployeeResponse();
	boolean res=service.add(employee);	
	if(res==true) {
		employeeResponse.setStatus(200);
		employeeResponse.setCode("added sucessful");
		employeeResponse.setEmployee2(employee);
	}else {
		employeeResponse.setStatus(400);
		employeeResponse.setCode("cannot be added");
	}
	return employeeResponse;
	}



@GetMapping(path="/get",produces = {MediaType.APPLICATION_JSON_VALUE})
public Employee get(int empid) {
	return service.get(empid);
}
@GetMapping(path="/getAll", produces= {MediaType.APPLICATION_JSON_VALUE})
public EmployeeResponse all(){
	EmployeeResponse employeeResponse = new EmployeeResponse();
List<Employee> list=service.getall();
	if(list!=null) {
		 
		employeeResponse.setStatus(200);
		employeeResponse.setCode("displayed all");
		employeeResponse.setEmployee(list);
		
	}else {
		employeeResponse.setStatus(400);
		employeeResponse.setCode("error");	
	}
	return employeeResponse;
	
}

}

