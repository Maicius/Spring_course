package neu.danny;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class BeanFactoryAware_Interface implements InitializingBean,BeanNameAware,BeanFactoryAware
{
	/*
	 * 实现BeanFactoryAware接口的Bean类，在依赖关系设定完成后、初始化方法之前，Spring容器将会
	 * 通过setBeanFactory()方法将BeanFactory的实例注入Bean中。
	 */
	private String name;
    
    public BeanFactoryAware_Interface(){
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
		System.out.println("---BeanFactory is "+arg0);//获得BeanFactory容器的引用
		
	}

    
}