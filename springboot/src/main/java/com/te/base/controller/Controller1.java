package com.te.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.base.dto.Employee;
import com.te.base.service.EmployeeService;

@RestController
public class Controller1 {
	@Autowired
	private EmployeeService service;

	@PostMapping(path="/addData",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> addData(@RequestBody Employee employee) {
		try {
			service.addEmployee(employee);
			return new ResponseEntity<String>("data added successfully", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping(path="/update",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> updateData(@RequestBody Employee employee) {
		try {
			service.updateEmployee(employee);
			return new ResponseEntity<String>("data updated successfully",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}
	@GetMapping(path="/delete",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> deleteData(int id){
		try {
			service.deleteEmployee(id);
			 return new ResponseEntity<String>("data updated successfully",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping(path="/find",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public Employee findData(int id){
	return	service.findEmployee(id);
			 
	}
		
	
}
