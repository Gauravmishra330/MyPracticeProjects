package restpractise.base.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import restpractise.base.dto.Martemp;

@Repository
public class daoimpl implements daoinf {

	@Override
	public Martemp addData(Martemp emp) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demolish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(emp);
		transaction.commit();
		return emp;
	}

	@Override
	public Martemp findData(Martemp emp) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demolish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Martemp emp1 = manager.find(Martemp.class, emp.getId());
		transaction.commit();
		return emp1;
	}

	@Override
	public List<Martemp> findall() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demolish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String query = "from Martemp";
		Query jp = manager.createQuery(query);
		List<Martemp> list = jp.getResultList();
		if (list != null) {
			transaction.commit();
			return list;

		} else {
			return null;
		}
	}

	@Override
	public boolean delete(Martemp emp) {
		boolean result = false;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demolish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Martemp empl = manager.find(Martemp.class, emp.getId());
		if (empl != null) {
			manager.remove(empl);
			transaction.commit();
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	@Override
	public boolean update(Martemp emp) {
		boolean result = false;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demolish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Martemp empl = manager.find(Martemp.class, emp.getId());
		if (empl != null) {
			empl.setName(emp.getName());
			transaction.commit();
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
