package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		Emp em=(Emp)ac.getBean("emp1");
		System.out.println(em);
	}
}
