package com.spring.ORM;

import java.util.List;

import org.springframework.transaction.annotation.Transactional; 

import org.springframework.stereotype.Service;

import com.spring.ORM.Dao.studentDao;
import com.spring.ORM.entity.Student;

@Service
public class StudentService {
       private final studentDao sDao;

	   public StudentService(studentDao sDao) {
		
		this.sDao = sDao;
	   }
	   @Transactional  
	   public void addStudent(Student st) {
		   sDao.save(st);
	   }
	   @Transactional(readOnly = true)
	   public Student getStudent(int id) {
		   return sDao.findbyId(id);
	   }
	   @Transactional(readOnly = true)
	   public List<Student> getAllStudent(){
		   return sDao.findall();
	   }
	   @Transactional
	   public void updateStudent(Student st) {
		   sDao.update(st);
	   }
	   @Transactional
	   public void deleteStu(int id) {
		   sDao.delete(id);
	   }
	   
       
}
