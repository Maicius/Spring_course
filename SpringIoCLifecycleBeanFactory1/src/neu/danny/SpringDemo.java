package neu.danny; 


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDemo { 
    public static void main(String[] args) { 
    	
    	/**
    	 * 注意的一点：
    	 * 		ConfigurableBeanFactory和ApplicationContext对待bean后置处理器稍有不同。
    	 * 		ApplicationContext会自动检测在配置文件中实现了BeanPostProcessor接口的所有bean，
    	 * 		并把它们注册为后置处理器，然后在容器创建bean的适当时候调用它。
    	 * 		部署一个后置处理器同部署其他的bean并没有什么区别。
    	 * 		而使用ConfigurableBeanFactory实现的时候，bean 后置处理器必须通过下面类似的代码显式地去注册。
    	 */
    	
    	BeanPostProcessorImp bppImp = new BeanPostProcessorImp();//注册BeanPostProcessor
        Resource rs = new ClassPathResource("neu/danny/applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(rs); //不支持注册功能
        ConfigurableBeanFactory factory = new XmlBeanFactory(rs);
        factory.addBeanPostProcessor(bppImp);//尝试注释本行代码，看输出结果少哪些内容？
        
        HelloBean hello = (HelloBean) factory.getBean("helloBean"); 
        System.out.println(hello.getHelloWord()); 
    } 
}