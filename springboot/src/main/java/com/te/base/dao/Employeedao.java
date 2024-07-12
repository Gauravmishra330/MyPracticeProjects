package com.te.base.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.base.dto.Employee;
@Repository
public interface Employeedao extends CrudRepository<Employee, Integer>{
	public Employee findByEmpid(int id) ;
}
