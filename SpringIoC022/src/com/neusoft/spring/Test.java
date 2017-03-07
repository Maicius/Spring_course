package com.neusoft.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student)factory.getBean("student_1");
		System.out.println("s1:"+s);
		
		System.out.println();
		Student s2 = (Student)factory.getBean("student_2");
		System.out.println("s2:"+s2);
	}

}
