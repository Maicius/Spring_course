package neu.danny; 


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo { 
    public static void main(String[] args) { 
    	
    	/**
    	 * 		ApplicationContext会自动检测在配置文件中实现了BeanPostProcessor接口的所有bean，
    	 * 		并把它们注册为后置处理器，然后在容器创建bean的适当时候调用它。
    	 * 		部署一个后置处理器同部署其他的bean并没有什么区别。
    	 */
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("neu/danny/applicationContext.xml");
    	
        HelloBean hello = (HelloBean) context.getBean("helloBean"); 
        System.out.println(hello.getHelloWord()); 
    } 
}