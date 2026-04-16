package com.springJdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJdbc.Dao.StudentdDao;
@Configuration
@ComponentScan(basePackages = "com.springJdbc")
public class JdbcConfig {
	  @Bean
      public DataSource getSource() {
    	  DriverManagerDataSource ds = new DriverManagerDataSource();
    	  ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
          ds.setUrl("jdbc:mysql://localhost:3309/myhiber");
          ds.setUsername("root");
          ds.setPassword("sayan2005@@S");
          return ds;
      }
	  @Bean
	  public JdbcTemplate getTemplate() {
		  return new JdbcTemplate(getSource());
	  }
	 
}
