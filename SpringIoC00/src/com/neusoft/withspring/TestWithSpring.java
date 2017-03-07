package com.neusoft.withspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithSpring {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)factory.getBean("userService");

		userService.queryUser();
	}

}																																																																					