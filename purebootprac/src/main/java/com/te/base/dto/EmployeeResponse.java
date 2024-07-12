package com.te.base.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse {

	
	private int status;
	private String code;
	private List<Employee> employee;
	private Employee employee2;
}
