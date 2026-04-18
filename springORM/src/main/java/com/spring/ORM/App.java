package com.spring.ORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import java.util.List;
import com.spring.ORM.Dao.StudentDaoImpl;
import com.spring.ORM.entity.Employe;
import com.spring.ORM.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program stated...." );
        
        ApplicationContext ac = new  AnnotationConfigApplicationContext(AppConfig.class);
        EmloyeService es=ac.getBean(EmloyeService.class);
        
        Employe e=new Employe();
        
        
        es.getAllEmp();
       
    }
}
