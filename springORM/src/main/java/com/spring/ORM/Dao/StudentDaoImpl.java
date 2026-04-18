package com.spring.ORM.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory; 
import com.spring.ORM.entity.Student;
@Repository
public class StudentDaoImpl implements studentDao{
    
	private final SessionFactory sessionFactory ;
	
	@Autowired
	public StudentDaoImpl(SessionFactory sessionFactory) {
	
		this.sessionFactory = sessionFactory;
	}
	

	@Override
	public void save(Student st) {
		 sessionFactory.getCurrentSession().persist(st);
		
	}

	@Override
	public Student findbyId(int id) {
	
		return sessionFactory.getCurrentSession().get(Student.class, id);
	}

	@Override
	public List<Student> findall() {
		
		return sessionFactory.getCurrentSession().createQuery("from Student",Student.class).getResultList();
		
	}

	@Override
	public void update(Student st) {
		sessionFactory.getCurrentSession().merge(st);
		
	}

	@Override
	public void delete(int id) {
		Student st= findbyId(id);
		if(st!=null) {
			sessionFactory.getCurrentSession().remove(st);
		}
		
	}

}
