package neu.danny; 


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo { 
    public static void main(String[] args) { 
    	
    	/**
    	 * 		ApplicationContext���Զ�����������ļ���ʵ����BeanPostProcessor�ӿڵ�����bean��
    	 * 		��������ע��Ϊ���ô�������Ȼ������������bean���ʵ�ʱ���������
    	 * 		����һ�����ô�����ͬ����������bean��û��ʲô����
    	 */
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("neu/danny/applicationContext.xml");
    	
        HelloBean hello = (HelloBean) context.getBean("helloBean"); 
        System.out.println(hello.getHelloWord()); 
    } 
}