package com.neuedu.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloContro2 {

    @RequestMapping(value="/hello2",method=RequestMethod.GET,params="userId=1")
    public ModelAndView getInfo(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","你好");
        mv.setViewName("hello.jsp");

        return mv;
    }

    @RequestMapping(value="item")
    public String edit(Model model){
        model.addAttribute("info", "tiaozhuan");
        return "item.jsp";
    }
}
