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
		 * һ��XmlWebApplicationContext��ʽ��
		 */		
//		XmlWebApplicationContext ctx = new XmlWebApplicationContext();
//		ctx.setServletContext(this.getServletContext());//��XmlWebApplicationContext���浽ServletContext��
//		ctx.setConfigLocations(new String[] {"/WEB-INF/applicationContext.xml"});//��������ļ�����Ϣ
//		ctx.refresh();//ʹ������Ч
//		HelloBean hello = (HelloBean) ctx.getBean("helloBean"); //���ص��������ļ�
//		
//		out.println("<BR>---------------XmlWebApplicationContext��ʽ��----------------<BR>");
//		out.println(hello.getHelloWord());
//		out.println("<BR>-------------------------------<BR>");
//		
//		out.println("  </BODY>");
//		out.println("</HTML>");
		
		
		/**
		 * ����WebApplicationContext��ʽ 
		 * 
		 * ��web����������SpringӦ�ó������һ�����������������ϵ�Ĺ��̡�
		 * SpringΪwebӦ���ṩ�������ĵ���չ�ӿ� WebApplicationContext��
		 * ��һ����������̣�Spring��ʹ��һ��Ĭ�ϵ�ʵ�֣�
		 * XmlWebApplicationContext - ���������ʵ����Ϊ��web�����еĸ�����������������������
		 * 
		 * ����XmlWebApplicationContext,WebApplicationContextʹ��XmlBeanDefinitionReader����bean������Ϣ�����н�����  
		 * 
		 * �����ڿ�������JSP ҳ������ֱ�ӷ��� Spring ����ʱ��
		 * ���������Ȼ�ȡ WebApplicationContext ����
		 * Spring ����������ʱ�� WebApplicationContext ������ ServletContext�������б��У�
		 * ͨ�� WebApplicationContextUtils ��������Է���ػ�ȡ WebApplicationContext ����
		 * 
		 * ע��
		 * 		WebApplicationContextUtils  XmlWebApplicationContext
		 */		
		ServletContext servletContext = request.getSession().getServletContext();    
		WebApplicationContext ctx1 = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        HelloBean hello1 = (HelloBean) ctx1.getBean("helloBean"); //���ص��������ļ�
       
        out.println("<BR>---------------WebApplicationContext��ʽ----------------<BR>");
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
