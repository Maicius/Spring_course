package neu.danny; 
/**
 * ClassPathXmlApplicationContext加载xml时已经进行了
 */

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory; 
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 


public class SpringDemo { 
    public static void main(String[] args) { 
        /*
         * org.springframework.core.io.FileSystemResource��ʵ����
         * org.springframework.core.io.Resource.Resource�ӿڣ�
         * ��ָ������·�������·����ָ��Bean�����ļ���λ�á�
         */
//        Resource rs = new FileSystemResource("applicationContext.xml");
    	System.out.println("Factory  begin load...");
        Resource rs = new FileSystemResource("aaa/applicationContext.xml");

        /*
         * BeanFactory��Factoryģʽ��һ��ʵ�����ӣ�����;��Ϊһ�㣬���Խ���������ͬ���͵Ķ���
         * ��Spring1.2֮��XmlBeanFactoryֻ����ʵ��Resource�ӿڵĶ���
         */  
        System.out.println("Factory  begin parse...");
        @SuppressWarnings("deprecation")
        
		BeanFactory factory = new XmlBeanFactory(rs);     	
    	//��������ǳ��÷�ʽ
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext2.xml"));
        System.out.println("Factory finished parse");
        System.out.println("Context begin parse");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        System.out.println("Context finished parse");
        HelloBean hello = (HelloBean) context.getBean("helloBean");
        System.out.println("hello:" + hello.getHelloWorld());
        
        HelloBean hello2 = (HelloBean) factory.getBean("helloBean"); 
//        HelloBean hello = (HelloBean) factory.getBean("helloBean_aaa"); 
        
        System.out.println("---hello.getHelloWord()="+hello2.getHelloWorld()); 
    } 
}