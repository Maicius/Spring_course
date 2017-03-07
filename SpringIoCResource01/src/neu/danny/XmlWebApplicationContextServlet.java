package neu.danny;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class XmlWebApplicationContextServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//∑√Œ £∫http://localhost:8181/SpringIoCResource01/servlet/XmlWebApplicationContextServlet?haha=aaaaa
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		
		ServletContext servletContext = request.getSession().getServletContext();		
		WebApplicationContext ctx1 = WebApplicationContextUtils.getWebApplicationContext(servletContext);		
		Resource servlteResource = ctx1.getResource("/WEB-INF/applicationContext.xml");		
		if(servlteResource instanceof org.springframework.web.context.support.ServletContextResource){
	    	   System.out.println("Resource is  :   org.springframework.core.io.ServletContextResource");
	    }       
		HelloBean hello = (HelloBean) ctx1.getBean("hello");
		out.println(hello.getHelloWord() + "<ba/>");
		out.println(request.getParameter("haha"));
        out.println("<BR>---------------WebApplicationContext∑Ω Ω----------------<BR>");

		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}
	public void init() throws ServletException {
		
	}
	public XmlWebApplicationContextServlet() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
	}
}
