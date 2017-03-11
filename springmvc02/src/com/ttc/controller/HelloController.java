package com.ttc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		ModelAndView mav = new ModelAndView("hello.jsp");
//		mav.addObject("message", "hello springmvc haha");
		
		//和上面注释的效果一样
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "hello springmvc haha555");
		
		mav.setViewName("hello.jsp");
		
		return mav;
	}

}
