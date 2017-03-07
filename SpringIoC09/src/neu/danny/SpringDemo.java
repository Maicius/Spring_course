package neu.danny; 


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo { 
    public static void main(String[] args) { 
    	//1��BeanFactory����Ĭ�Ϸ�ʽ����������
//        Resource rs = new ClassPathResource("neu/danny/applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(rs); 
        
    	//2��ApplicationContextĬ���Ƿ������أ������������������Ժ�ͨ��ApplicationContext���ܹ�����������
    	ApplicationContext factory = new ClassPathXmlApplicationContext(
			"neu/danny/applicationContext.xml");
    	
        //�����ǻ�ȡbean����
        DependBean depend1 = (DependBean) factory.getBean("dependBean");
        System.out.println(depend1.getHelloBean().getHelloWord()+ "  by dependBean!"); 
    } 
}
