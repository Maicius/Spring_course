package neu.danny;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAware_Interface implements InitializingBean,BeanNameAware,
	BeanFactoryAware,ApplicationContextAware{
	/*
	 * 实现ApplicationContextAware接口的Bean类，在Bean类被初始化后，会将ApplicationContext的实例
	 * 通过setApplicationContext()方法注入Bean中。
	 */
	private String name;
    
    public ApplicationContextAware_Interface(){
        System.out.println("JavaBean类构造方法");
    }
    
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean 接口 afterPropertiesSet()方法");
        
    }
    
    public void init() throws Exception {
        System.out.println("JavaBean类自定义的init() 方法");
        
    }
   
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        System.out.println("JavaBean类setName() 方法");
        this.name = name;
    }

	public void setBeanName(String arg0) {
		System.out.println("Bean在applicationContext.xml配置文件中定义的名称："+arg0);
		
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("---BeanFactoryAware接口的setBeanFactory()方法");
		
	}

	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("---ApplicationContextAware接口的setApplicationContext()方法");
		System.out.println("---ApplicationContext is "+arg0);//获得ApplicationContext容器的引用
	}

    
}