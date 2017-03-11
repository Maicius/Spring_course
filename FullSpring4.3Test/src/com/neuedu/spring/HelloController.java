package com.neuedu.spring;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by Maicius on 2017/3/10.
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
    ModelAndView mv = new ModelAndView();
    mv.addObject("msg", "Hello Brother");
    mv.setViewName("hello.jsp");

    return mv;
    }
}
