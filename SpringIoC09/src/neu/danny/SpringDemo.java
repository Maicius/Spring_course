package neu.danny; 


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo { 
    public static void main(String[] args) { 
    	//1、BeanFactory容器默认方式就是懒加载
//        Resource rs = new ClassPathResource("neu/danny/applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(rs); 
        
    	//2、ApplicationContext默认是非懒加载，所以设置懒加载属性后，通过ApplicationContext才能够看出懒加载
    	ApplicationContext factory = new ClassPathXmlApplicationContext(
			"neu/danny/applicationContext.xml");
    	
        //下面是获取bean对象
        DependBean depend1 = (DependBean) factory.getBean("dependBean");
        System.out.println(depend1.getHelloBean().getHelloWord()+ "  by dependBean!"); 
    } 
}
