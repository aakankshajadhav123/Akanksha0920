package com.Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext ap=new	ClassPathXmlApplicationContext("Setter.xml");
	Student stu=	(Student) ap.getBean("p");
	
	System.out.println(stu);
	stu.getMassage("i am from ");
	}

	// hii mahesh where r u ?

}
