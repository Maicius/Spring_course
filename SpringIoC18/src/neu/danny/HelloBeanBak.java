package neu.danny; 

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloBeanBak implements BeanNameAware,BeanFactoryAware,DisposableBean,InitializingBean,ApplicationContextAware
{ 
    
	private String helloWord; 
	
	public HelloBeanBak(){
		System.out.println("Bean的构造方法");
	}
	
    //Bean自定义初始化方法
    public void meInit(){
    	System.out.println("Bean自定义初始化方法");
    }
    
    public void setHelloWord(String helloWord) { 
        this.helloWord = helloWord; 
        System.out.println("Bean的Set方法");
    } 
    public String getHelloWord() { 
    	System.out.println("Bean的Get方法");
        return helloWord; 
    }
    
    //BeanNameAware的方法
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("BeanNameAware的方法");
	}
	
	//BeanFactoryAware的方法
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanFactoryAware的方法");
	}

	//DisposableBean的消亡方法
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean的消亡方法");
		
	}
	
	//自定义的消亡方法
	public void meDestroy(){
		System.out.println("自定义的消亡方法");
	}

	//InitializingBean的初始化方法
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean的初始化方法");
		
	}

	//ApplicationContextAware的方法
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("ApplicationContextAware的方法");
		
	}
	

}