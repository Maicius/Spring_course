package neu.danny; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo { 
    public static void main(String[] args) { 
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_bytype.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_byname.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_constructor.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_autodetect.xml"); 
        
        HelloBean hello = (HelloBean) context.getBean("helloBean");
        System.out.print(hello.getHelloWord());
        System.out.print(" It's ");
        System.out.print(hello.getDate().toLocaleString());
        System.out.println(".");
    } 
}