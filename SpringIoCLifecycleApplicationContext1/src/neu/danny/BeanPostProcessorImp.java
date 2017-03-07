package neu.danny;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImp implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("BeanPostProcessor�ĺ��ʼ������");
		
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanPostProcessor��Ԥ��ʼ������");
		
		if ((arg0 instanceof HelloBean)) {  
			  
			
			HelloBean hello = (HelloBean) arg0;  
			  
			hello.setHelloWord("����");
			  
			return arg0;  
			  
		} 
		
		return arg0;
	}

}
