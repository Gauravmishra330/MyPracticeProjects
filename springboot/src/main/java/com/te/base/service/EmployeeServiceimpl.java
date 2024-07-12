package com.te.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.base.dao.Employeedao;
import com.te.base.dto.Employee;

@Service
public  class EmployeeServiceimpl implements EmployeeService{
	@Autowired
	private Employeedao dao;

	@Override
	public Employee addEmployee(Employee employee) {
		return dao.save(employee);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
	dao.deleteById(id);
	}

	@Override
	public Employee findEmployee(int id) {
	 return dao.findByEmpid(id);
		
	}

}
