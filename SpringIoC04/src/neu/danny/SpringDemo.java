package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"neu/danny/applicationContext.xml");

		HelloBean hello = (HelloBean) context.getBean("helloBean");

		System.out.print(hello.getHelloWord());
		System.out.print(" It's ");
		System.out.print(hello.getDate().toLocaleString());
		System.out.println(".");
		System.out.println(hello.getHahaBean().getHaha());
	}
}