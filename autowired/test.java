package com.springcore.wire.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/wire/autowired/wireconfig.xml");
        
        person p=(person)ac.getBean("person");
        
        System.out.println(p);
	}

}
