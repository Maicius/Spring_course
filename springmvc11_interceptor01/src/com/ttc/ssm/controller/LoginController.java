package com.ttc.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	//登录
	@RequestMapping("/login")
	public String login(HttpSession session,String userName,String password) throws Exception {
		//调用service进行用户名和密码验证
		//如果验证成功，将用户信息保存到session中
		session.setAttribute("username", userName);
		return "redirect:/items/queryItems.action";
	}
	
	//退出
	@RequestMapping("logout")
	public String logout(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:/items/queryItems.action";
	}

}
