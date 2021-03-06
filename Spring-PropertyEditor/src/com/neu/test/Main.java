package com.neu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neu.bean.Order;

/**
 * Application start entry.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        System.out.println(((Order)context.getBean("order")).getContact());
    }
}
