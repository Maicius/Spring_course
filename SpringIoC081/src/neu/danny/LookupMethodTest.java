package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookupMethodTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
			"neu/danny/applicationContext.xml");
		
		UserManager manager1=(UserManager) context.getBean("userManager");
		manager1.createUser();    //create a User              
		UserManager manager2=(UserManager) context.getBean("userManager");
		manager2.createUser();  
		
		System.out.println("Identity Equal?: " + (manager1.getUserDao() == manager2.getUserDao())); 
        System.out.println("Value Equal:? " + manager1.getUserDao().equals(manager2.getUserDao()));
	
	}
}	
