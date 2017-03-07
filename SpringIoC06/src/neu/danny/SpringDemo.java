package neu.danny; 


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo { 
    public static void main(String[] args) { 
    	ApplicationContext context = new ClassPathXmlApplicationContext(
    		"neu/danny/applicationContext.xml");

        HelloBean hello1 = (HelloBean) context.getBean("helloBean"); 
        HelloBean hello2 = (HelloBean) context.getBean("helloBean"); 
        
        System.out.println("Identity Equal?: " + (hello1 == hello2)); 
        System.out.println("Value Equal:? " + hello1.equals(hello2)); 
    } 
}