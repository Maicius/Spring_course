package com.neusoft.nospring;

public class TestNospring {

	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.queryUser();

		/*
		 *˵��������������UserDAO��ʵ�ַ�ʽA��B���Ѿ��ڴ�����д����ʹ��UserDAO_A�ķ�ʽʵ��DAO�㹦�ܣ�
		 *
		 *��Ȼ��һ�죬�ͻ�˵��ʹ��UserDAO_B�ķ�ʽ��ʵ��DAO��Ĺ��ܡ���Ҫ���Ǹ�дUserService���룬
		 *����UserDAO_A��ʹ�ø�ΪUserDAO_B��ʹ�á�����������϶�̫�ߡ�
		 */
	}

}
