package restpractise.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restpractise.base.dao.daoinf;
import restpractise.base.dto.Martemp;

@Service
public class serviceimpl implements serviceinf{
@Autowired
private daoinf dao;
	
	@Override
	public Martemp addData(Martemp emp) {
		return dao.addData(emp);
	}

	@Override
	public Martemp findData(Martemp emp) {
		if(emp.getId()<0) {
			return null;
		}
		return dao.findData(emp);
	}

	@Override
	public List<Martemp> findall() {
		return dao.findall();
	}

	@Override
	public boolean delete(Martemp emp) {
		return dao.delete(emp);
	}

	@Override
	public boolean update(Martemp emp) {
		
		return dao.update(emp);
	}

}
