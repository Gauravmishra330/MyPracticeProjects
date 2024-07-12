package restpractise.base.service;

import java.util.List;

import restpractise.base.dto.Martemp;

public interface serviceinf {
public Martemp addData(Martemp emp);
public Martemp findData(Martemp emp);
public List<Martemp> findall();
public boolean delete(Martemp emp);
public boolean update(Martemp emp);
}
