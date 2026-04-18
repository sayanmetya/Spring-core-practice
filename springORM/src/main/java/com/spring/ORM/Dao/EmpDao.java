package com.spring.ORM.Dao;

import com.spring.ORM.entity.Employe;
import java.util.List;
public interface EmpDao {
     
	public void insert(Employe e);
	public Employe getEmp(int id);
	public List<Employe> getAllEmp();
	public void update(Employe e);
	public void delete(int id);
}
