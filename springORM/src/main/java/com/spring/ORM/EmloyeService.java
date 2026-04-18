package com.spring.ORM;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.ORM.Dao.EmpDao;
import com.spring.ORM.entity.Employe;

@Service
public class EmloyeService {
      
	private EmpDao eDao;
    
	public EmloyeService(EmpDao eDao) {
		
		this.eDao = eDao;
	}
	@Transactional
	public void addEmp(Employe e) {
		eDao.insert(e);
	}
	@Transactional(readOnly = true)
	public Employe getEmp(int id) {
		return eDao.getEmp(id);
	}
	@Transactional(readOnly = true)
	public List<Employe> getAllEmp(){
		return eDao.getAllEmp();
	}
	@Transactional
	public void update(Employe e) {
		 eDao.update(e);
	}
	@Transactional
	public void delete(int id) {
		eDao.delete(id);
	}
	
	
}
