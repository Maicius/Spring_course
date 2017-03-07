package neu.danny;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class XmlWebApplicationContextServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		
		/**
		 * 一、XmlWebApplicationContext方式：
		 */		
//		XmlWebApplicationContext ctx = new XmlWebApplicationContext();
//		ctx.setServletContext(this.getServletContext());//将XmlWebApplicationContext保存到ServletContext中
//		ctx.setConfigLocations(new String[] {"/WEB-INF/applicationContext.xml"});//添加配置文件的信息
//		ctx.refresh();//使配置生效
//		HelloBean hello = (HelloBean) ctx.getBean("helloBean"); //加载单个配置文件
//		
//		out.println("<BR>---------------XmlWebApplicationContext方式：----------------<BR>");
//		out.println(hello.getHelloWord());
//		out.println("<BR>-------------------------------<BR>");
//		
//		out.println("  </BODY>");
//		out.println("</HTML>");
		
		
		/**
		 * 二、WebApplicationContext方式 
		 * 
		 * 在web容器中启动Spring应用程序就是一个建立这个上下文体系的过程。
		 * Spring为web应用提供了上下文的扩展接口 WebApplicationContext。
		 * 而一般的启动过程，Spring会使用一个默认的实现，
		 * XmlWebApplicationContext - 这个上下文实现作为在web容器中的根上下文容器被建立起来。
		 * 
		 * 对于XmlWebApplicationContext,WebApplicationContext使用XmlBeanDefinitionReader来对bean定义信息来进行解析。  
		 * 
		 * 当您在控制器、JSP 页面中想直接访问 Spring 容器时，
		 * 您必须事先获取 WebApplicationContext 对象。
		 * Spring 容器在启动时将 WebApplicationContext 保存在 ServletContext的属性列表中，
		 * 通过 WebApplicationContextUtils 工具类可以方便地获取 WebApplicationContext 对象。
		 * 
		 * 注：
		 * 		WebApplicationContextUtils  XmlWebApplicationContext
		 */		
		ServletContext servletContext = request.getSession().getServletContext();    
		WebApplicationContext ctx1 = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        HelloBean hello1 = (HelloBean) ctx1.getBean("helloBean"); //加载单个配置文件
       
        out.println("<BR>---------------WebApplicationContext方式----------------<BR>");
		out.println(hello1.getHelloWord());
		out.println("<BR>-------------------------------<BR>");
		
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}
	public void init() throws ServletException {
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
	}

}
