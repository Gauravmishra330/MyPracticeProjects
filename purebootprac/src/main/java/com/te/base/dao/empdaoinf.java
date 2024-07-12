package com.te.base.dao;

import java.util.List;

import com.te.base.dto.Employee;

public interface empdaoinf {
public Employee get(int empid);
public List<Employee> getall();
public boolean add(Employee employee);
public boolean update(Employee employee);
}
