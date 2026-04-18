package com.spring.ORM.Dao;

import java.util.List;

import com.spring.ORM.entity.Student;

public interface studentDao {
	
    public void save(Student st);
    public Student findbyId(int id);
    public List<Student> findall();
    public void update(Student st);
    public void delete(int id);
    
}
