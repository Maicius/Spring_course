package neu.danny; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo { 
    public static void main(String[] args) { 
    	ApplicationContext context = new ClassPathXmlApplicationContext(
			"neu/danny/applicationContext.xml");
      //��������dependency-check���Ե�����£������������У���������ļ�û��ָ��������ϵ����Ȼ��UnsatisfiedDependencyException�쳣
//        HelloBean hello = (HelloBean) context.getBean("helloBean");
//        System.out.print(hello.getDate());
        
    } 
}