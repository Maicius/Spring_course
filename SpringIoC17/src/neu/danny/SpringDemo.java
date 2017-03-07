package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		// 比较ApplicationContext和BeanFactory两种实现方法的不同，
		// 在BeanFactory方式如果没有用代码注册BeanPostProcessor则不能修改Hello为大写；

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//		context.addBeanPostProcessor((BeanPostProcessor) context.getBean("uppercaseModifier"));// 将后置处理器注册给context

		HelloBean hello = (HelloBean) context.getBean("helloBean");

		System.out.println(hello.getHelloWord());
	}
}