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
		//1����2��3����4
		
		UserDaoIface userDao = new UserDao4Oracle9Impl();	// 1
//		UserDaoIface userDao = new UserDao4DB2Impl();	// 2
		
		UserServiceIface user_service = new UserServiceWithConstructorImpl(userDao);	// 3	
//		UserServiceWithSettersImpl user_service = new UserServiceWithSettersImpl();	// 4
//		user_service.setUserDao(userDao);	// 4
		
		user_service.validateLogin("yang.hb","12345678");
		/*
		 * ���ϣ������װ������������������
		 * �������ֶ���new �����ģ�д������������ˡ�
		 * �������Ҫ����������ʵ���߼��Ļ��������������Ҫ����д��
		 * 
		 * ��һ����Ŀ�У���������������ϵ�Ķ����ǳ��࣬����ά�����������������Ǻ��鷳�ġ�
		 */
	}
}
