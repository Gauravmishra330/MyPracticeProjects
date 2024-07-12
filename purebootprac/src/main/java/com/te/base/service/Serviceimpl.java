package com.te.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.base.dao.empdaoinf;
import com.te.base.dto.Employee;
@Service
public class Serviceimpl implements Serviceint{
@Autowired	
private empdaoinf dao;	

	@Override
	public boolean add(Employee employee) {
		
		return dao.add(employee);
	}

	@Override
	public Employee get(int empid) {

		return dao.get(empid);
	}

	@Override
	public List<Employee> getall() {
	 return	dao.getall();
	
	}

	

	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

}
