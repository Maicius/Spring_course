/**
 * 
 */
package com.neusoft.service.iface;

/**
 * @author Eddy Yang
 *
 * Dec 3, 2008
 */
public interface UserServiceIface {
	public boolean validateLogin(String id,String pwd);
	public String selectEmpName();
}
