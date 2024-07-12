package com.te.base.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.base.dto.Employee;
@Repository
public class empdaoimpl implements empdaoinf{
	@Override
	public boolean add(Employee employee) {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("demo");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	transaction.begin();
	try {
		manager.persist(employee);
		transaction.commit();
			return true;
	} catch (Exception e) {
		return false;
	}
	}

	@Override
	public Employee get(int empid) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("demo");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Employee employee=manager.find(Employee.class,empid);
		transaction.commit();
		return employee;
	}

	@Override
	public List<Employee> getall() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("demo");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String query="from Employee";
		Query que=manager.createQuery(query);
		List<Employee> list=que.getResultList();
		transaction.commit();
		
		
		return list;
	}

	

	@Override
	public boolean update(Employee employee) {
		
		return false;
	}

}
