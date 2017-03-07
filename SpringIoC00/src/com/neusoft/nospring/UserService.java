package com.neusoft.nospring;

public class UserService {
	UserDAO_A userDAO = new UserDAO_A();
	
	public void queryUser(){
		System.out.println("---in service, begin");
		userDAO.queryUser();
		System.out.println("---in service, end");
	}

}
