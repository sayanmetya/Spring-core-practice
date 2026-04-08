package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ac=  new ClassPathXmlApplicationContext("com/springcore/constructor/construcconfig.xml");
       person p=(person)ac.getBean("p1");
       
       System.out.println(p);
       
	}

}
