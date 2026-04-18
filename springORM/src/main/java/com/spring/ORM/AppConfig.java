package com.spring.ORM;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;
@Configuration
@ComponentScan("com.spring.ORM")
@EnableTransactionManagement
public class AppConfig {
    @Bean
	public DataSource datasSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3309/myhiber");
        ds.setUsername("root");
        ds.setPassword("sayan2005@@S");
		return ds;
	}
	@Bean
	public  LocalSessionFactoryBean factory() {
		LocalSessionFactoryBean ls = new LocalSessionFactoryBean();
		ls.setDataSource(datasSource());
		ls.setPackagesToScan("com.spring.ORM");
		
		Properties pro = new Properties();
		pro.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        pro.put("hibernate.hbm2ddl.auto","update");
        pro.put("hibernate.show_sql","true");
        
        ls.setHibernateProperties(pro);
        return ls;
	}
	@Bean
	public HibernateTransactionManager transmanager(SessionFactory ls) {
		return new HibernateTransactionManager(ls);
	}
}
