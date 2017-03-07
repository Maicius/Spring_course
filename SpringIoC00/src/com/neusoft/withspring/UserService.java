package com.neusoft.withspring;

public class UserService {
	UserDAOI userDAO = null;
	public void setUserDAO(UserDAOI userDAO) {
		this.userDAO = userDAO;
	}

	public void queryUser(){
		System.out.println("---in service, begin");
		userDAO.queryUser();
		System.out.println("---in service, end");
	}

}
