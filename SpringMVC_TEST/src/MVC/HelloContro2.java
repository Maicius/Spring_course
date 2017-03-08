package MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Maicius on 2017/3/8.
 */
@Controller
@RequestMapping("/hello")
public class HelloContro2  {
    @RequestMapping(value = "/hello2", method= RequestMethod.GET, params = "userId=1")
    public ModelAndView getInfo(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "你好");
        mv.setViewName("../hello.jsp");

        return mv;
    }
    @RequestMapping(value = "item")
    public String edit(Model model){
        model.addAttribute("info", "tiaozhuan");

        return "../item.jsp";
    }

}
