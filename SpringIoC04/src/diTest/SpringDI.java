package diTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDI {
	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("diTest/applicationContext.xml");
		Maicius maicius = (Maicius) ac.getBean("Maicius");
		System.out.println("Maicius userName:" + maicius.getUserName());
		System.out.println("Maicius password:" + maicius.getPassword());
		System.out.println("Tongzi:"+maicius.getTongzi().getPassword() + maicius.getTongzi().getUserName());
	}
}
