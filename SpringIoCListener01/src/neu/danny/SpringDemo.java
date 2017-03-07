package neu.danny; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class SpringDemo { 
    public static void main(String[] args) { 
        ApplicationContext context = new ClassPathXmlApplicationContext(
                    "applicationContext.xml");
//        HelloBean hello = (HelloBean)context.getBean("helloBean");
//        System.out.println(hello.getHelloWord());        
        
        System.out.println("-----------------------------");
        
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBean hello2 = (HelloBean)factory.getBean("helloBean");
        System.out.println(hello2.getHelloWord());        
        
        factory.close();//这样会调用关闭的方法
    } 
}

