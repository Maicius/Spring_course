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
		System.out.println("Bean�Ĺ��췽��");
	}
	
    //Bean�Զ����ʼ������
    public void meInit(){
    	System.out.println("Bean�Զ����ʼ������");
    }
    
    public void setHelloWord(String helloWord) { 
        this.helloWord = helloWord; 
        System.out.println("Bean��Set����");
    } 
    public String getHelloWord() { 
    	System.out.println("Bean��Get����");
        return helloWord; 
    }
    
    //BeanNameAware�ķ���
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("BeanNameAware�ķ���");
	}
	
	//BeanFactoryAware�ķ���
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanFactoryAware�ķ���");
	}

	//DisposableBean����������
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean����������");
		
	}
	
	//�Զ������������
	public void meDestroy(){
		System.out.println("�Զ������������");
	}

	//InitializingBean�ĳ�ʼ������
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean�ĳ�ʼ������");
		
	}

	//ApplicationContextAware�ķ���
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("ApplicationContextAware�ķ���");
		
	}
	

}