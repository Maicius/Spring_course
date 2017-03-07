package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		JDBCTest jdbcTest = (JDBCTest)context.getBean("jdbcTest");
		jdbcTest.ConnectionTest();
	}
}
