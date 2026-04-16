package com.springJdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springJdbc.entity.Student;

public class RowmapperImpl implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.setRoll(rs.getInt(1));
		st.setName(rs.getString(2));
		st.setAddress(rs.getString(3));
		return st;
	}
    
}
