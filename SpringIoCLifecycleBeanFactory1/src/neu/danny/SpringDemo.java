package neu.danny; 


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDemo { 
    public static void main(String[] args) { 
    	
    	/**
    	 * ע���һ�㣺
    	 * 		ConfigurableBeanFactory��ApplicationContext�Դ�bean���ô��������в�ͬ��
    	 * 		ApplicationContext���Զ�����������ļ���ʵ����BeanPostProcessor�ӿڵ�����bean��
    	 * 		��������ע��Ϊ���ô�������Ȼ������������bean���ʵ�ʱ���������
    	 * 		����һ�����ô�����ͬ����������bean��û��ʲô����
    	 * 		��ʹ��ConfigurableBeanFactoryʵ�ֵ�ʱ��bean ���ô���������ͨ���������ƵĴ�����ʽ��ȥע�ᡣ
    	 */
    	
    	BeanPostProcessorImp bppImp = new BeanPostProcessorImp();//ע��BeanPostProcessor
        Resource rs = new ClassPathResource("neu/danny/applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(rs); //��֧��ע�Ṧ��
        ConfigurableBeanFactory factory = new XmlBeanFactory(rs);
        factory.addBeanPostProcessor(bppImp);//����ע�ͱ��д��룬������������Щ���ݣ�
        
        HelloBean hello = (HelloBean) factory.getBean("helloBean"); 
        System.out.println(hello.getHelloWord()); 
    } 
}