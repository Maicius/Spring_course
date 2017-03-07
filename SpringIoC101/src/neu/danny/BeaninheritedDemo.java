package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeaninheritedDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
			"neu/danny/applicationContext.xml");
        Chinese chinese = (Chinese) context.getBean("chinese");
//        People chinese = (People) context.getBean("chinese");
        System.out.println("name: " + chinese.getName());
        System.out.println("age: " + chinese.getAge());
        System.out.println("height: " + chinese.getHeight());
        
        System.out.println("--------------------");
        OtherCountry other = (OtherCountry) context.getBean("other");
        System.out.println("name: " + other.getName());
        System.out.println("age: " + other.getAge());
        System.out.println("height: " + other.getHeight());
    }
}
