package com.springJdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJdbc.Dao.StudentDaoImpl;
import com.springJdbc.Dao.StudentdDao;
import com.springJdbc.entity.Student;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Programm started..." );
        
      ApplicationContext ac=  new AnnotationConfigApplicationContext(JdbcConfig.class);
       StudentdDao st= ac.getBean(StudentDaoImpl.class);
      
       List<Student> stt=st.getallStudent();
       for(Student s:stt) {
    	   System.out.println(s);
       }
   
       
         
    }
}
