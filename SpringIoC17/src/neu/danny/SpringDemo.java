package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		// �Ƚ�ApplicationContext��BeanFactory����ʵ�ַ����Ĳ�ͬ��
		// ��BeanFactory��ʽ���û���ô���ע��BeanPostProcessor�����޸�HelloΪ��д��

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//		context.addBeanPostProcessor((BeanPostProcessor) context.getBean("uppercaseModifier"));// �����ô�����ע���context

		HelloBean hello = (HelloBean) context.getBean("helloBean");

		System.out.println(hello.getHelloWord());
	}
}