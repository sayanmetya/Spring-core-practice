package com.spring.ORM.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.spring.ORM.entity.Employe;
@Repository
public class EmpDaoImpImpl implements EmpDao{
    
	private SessionFactory factory;
	@Autowired
	public EmpDaoImpImpl(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void insert(Employe e) {
		factory.getCurrentSession().persist(e);
		
	}

	@Override
	public Employe getEmp(int id) {
		
		return factory.getCurrentSession().get(Employe.class, id);
	}

	@Override
	public List<Employe> getAllEmp() {
		
		return factory.getCurrentSession().createQuery("from Employe",Employe.class).getResultList();
	}

	@Override
	public void update(Employe e) {
		factory.getCurrentSession().merge(e);
		
	}

	@Override
	public void delete(int id) {
		Employe e=getEmp(id);
		if(e!=null) {
			factory.getCurrentSession().remove(e);
		}
		
	}

}
