package com.te.base.service;

import java.util.List;

import com.te.base.dto.Employee;

public interface Serviceint {
	public Employee get(int empid);
	public List<Employee> getall();
	public boolean add(Employee employee);
	public boolean update(Employee employee);
	}

