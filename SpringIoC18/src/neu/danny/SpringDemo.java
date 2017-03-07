package neu.danny; 


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo { 
    public static void main(String[] args) { 
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    	HelloBean hello = (HelloBean) context.getBean("helloBean"); 
        System.out.println(hello.getHelloWord()); 
    } 
}