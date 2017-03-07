/**
 * 
 */
package com.neusoft.service.impl;

import com.neusoft.dao.iface.UserDaoIface;
import com.neusoft.service.iface.UserServiceIface;

/**
 * @author Eddy Yang
 *
 * Dec 3, 2008
 */
public class UserServiceWithSettersImpl implements UserServiceIface{
	private UserDaoIface userDao;

	public void setUserDao(UserDaoIface userDao) {
		System.out.println("-------UserServiceWithSettersImpl--------");
		this.userDao = userDao;
	}
	public boolean validateLogin(String id,String pwd){
		userDao.login(id,pwd);
		return true;
	}
	public String selectEmpName(){
		String str = userDao.getEmpName();
		return "----call the selectEmpName() method----" + str;
	}
}
