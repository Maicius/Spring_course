package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeaninheritedDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
			"neu/danny/applicationContext.xml");
		
        Chinese chinese = (Chinese) context.getBean("chinese");
        System.out.println("company: " + chinese.getCompany());
        System.out.println("name: " + chinese.getName());
        System.out.println("age: " + chinese.getAge());
        
        System.out.println("----------------");
        English english = (English) context.getBean("english");
        System.out.println("company: " + chinese.getCompany());
        System.out.println("name: " + english.getName());
        System.out.println("age: " + english.getAge());
    }
}
