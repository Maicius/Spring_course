package MVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Maicius on 2017/3/8.
 */
public class HelloController implements Controller{
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Hello brother");
        mv.setViewName("hello.jsp");

        return mv;
    }

}
