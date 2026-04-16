package com.springJdbc.Dao;

import java.util.List;

import com.springJdbc.entity.Student;

public interface StudentdDao {
	
    public int insert(Student student);
    public int change(Student student);
    public int delete(Student student);
    
    public Student getStudent(int roll);
    public List<Student> getallStudent();
}
