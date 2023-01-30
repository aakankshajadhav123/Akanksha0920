package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext ap=new	ClassPathXmlApplicationContext("Setter.xml");
	Employee emp=	(Employee) ap.getBean("d");
	System.out.println(emp);
	emp.getMessage("my name is");
	
	}

}
