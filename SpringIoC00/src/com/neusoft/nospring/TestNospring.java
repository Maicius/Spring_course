package com.neusoft.nospring;

public class TestNospring {

	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.queryUser();

		/*
		 *说明：假设有两种UserDAO的实现方式A和B，已经在代码中写定了使用UserDAO_A的方式实现DAO层功能；
		 *
		 *忽然有一天，客户说想使用UserDAO_B的方式来实现DAO层的功能。需要我们改写UserService代码，
		 *将对UserDAO_A的使用改为UserDAO_B的使用。这样代码耦合度太高。
		 */
	}

}
