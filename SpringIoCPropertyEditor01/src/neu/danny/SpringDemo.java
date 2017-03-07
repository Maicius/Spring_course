package neu.danny; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.
                      FileSystemXmlApplicationContext; 

public class SpringDemo { 
    public static void main(String[] args) { 
    	ApplicationContext context = new ClassPathXmlApplicationContext(
			"neu/danny/applicationContext.xml");
         
        Contact c = (Contact)context.getBean("contact");
        
        System.out.println(c.getPhoneNumber().getAreaCode());
    } 
}