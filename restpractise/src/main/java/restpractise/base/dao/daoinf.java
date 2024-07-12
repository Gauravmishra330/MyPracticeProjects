package restpractise.base.dao;

import java.util.List;

import restpractise.base.dto.Martemp;

public interface daoinf {
public Martemp addData(Martemp emp);
public Martemp findData(Martemp emp);
public List<Martemp> findall();
public boolean delete(Martemp emp);
public boolean update(Martemp emp);
}
