package com.springJdbc.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springJdbc.entity.Student;
@Repository
public class StudentDaoImpl implements StudentdDao{
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
	@Override
	public int insert(Student student) {
	    String query="insert into studentdata(roll,name,address) values(?,?,?)";
	   int r= this.jdbcTemplate.update(query,student.getRoll(),student.getName(),student.getAddress());
		return r;
	}
	@Override
	public int change(Student student) {
		String query="update studentdata set name = ?, address = ? where roll = ?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getRoll());
		return r;
	}

	@Override
	public int delete(Student student) {
		String query="delete from studentdata where roll=?";
		int r=this.jdbcTemplate.update(query,student.getRoll());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public Student getStudent(int roll) {
		String query="select * from studentdata where roll=?";
		RowmapperImpl rowMapper = new RowmapperImpl();
		Student st=this.jdbcTemplate.queryForObject(query,rowMapper,roll);
		
		return st;
	}
	@Override
	public List<Student> getallStudent() {
		// TODO Auto-generated method stub
		String query="select* from studentdata";
		 List<Student> st=this.jdbcTemplate.query(query, new RowmapperImpl());
		
		return st;
	}

	
   
}
