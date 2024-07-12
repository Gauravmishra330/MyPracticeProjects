package com.te.base.service;

import com.te.base.dto.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(int id);
	public Employee findEmployee(int id);
}
