/**
 * 
 */
package com.neusoft.client;


import com.neusoft.dao.iface.UserDaoIface;
import com.neusoft.dao.impl.UserDao4Oracle9Impl;
import com.neusoft.service.iface.UserServiceIface;
import com.neusoft.service.impl.UserServiceWithConstructorImpl;

/**
 * @author Eddy Yang
 *
 * Dec 3, 2008
 */
public class ClientTest {
	public static void main(String[] args){
		//1或者2，3或者4
		
		UserDaoIface userDao = new UserDao4Oracle9Impl();	// 1
//		UserDaoIface userDao = new UserDao4DB2Impl();	// 2
		
		UserServiceIface user_service = new UserServiceWithConstructorImpl(userDao);	// 3	
//		UserServiceWithSettersImpl user_service = new UserServiceWithSettersImpl();	// 4
//		user_service.setUserDao(userDao);	// 4
		
		user_service.validateLogin("yang.hb","12345678");
		/*
		 * 如上，这个组装过程是由我们来做的
		 * 而且是手动的new 出来的，写死在这个类里了。
		 * 如果我们要换成其他的实现逻辑的话，这个程序代码就要重新写。
		 * 
		 * 在一个项目中，这样存在依赖关系的对象会非常多，所以维护起来、调用起来是很麻烦的。
		 */
	}
}
